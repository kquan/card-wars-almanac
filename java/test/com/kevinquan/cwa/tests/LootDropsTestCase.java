/*
 * Copyright 2014 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevinquan.cwa.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.creatures.Creature;
import com.kevinquan.cwa.model.levels.Level;
import com.kevinquan.cwa.model.levels.LevelStore;
import com.kevinquan.cwa.model.levels.LootDropStore;
import com.kevinquan.cwa.model.levels.LootDropStore.LootDropDetails;
import com.kevinquan.cwa.model.levels.LootDropStore.LootDropPriorityComparator;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class LootDropsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = LootDropsTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    protected LootDropStore mLootStore;
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.LEVEL_DROPS);
        mNameTranslater = NameTranslater.getInstance();
        mLevelStore = LevelStore.getInstance();
        mLootStore = LootDropStore.getInstance();
    }
    
    @Test
    public void testLoopDropBlueprint() {
        Hashtable<Integer, Hashtable<String, LootDropDetails>> dropData = parseLootDrops();
        for (int i = 1; i < Level.MAXIMUM_LEVEL; i++) {
            Hashtable<String, LootDropDetails> drops = dropData.get(i);
            List<LootDropDetails> expectedDrops = mLootStore.getDropsFor(i);
            assertThat("Incorrect number of drops for level "+i, drops.size(), is(expectedDrops.size()));
            for (LootDropDetails expectedDrop : expectedDrops) {
                LootDropDetails blueprintDrop = drops.get(expectedDrop.getCard().getId());
                assertThat("No loot details found for "+expectedDrop.getCard()+" on level "+i, blueprintDrop, notNullValue());
                assertThat("Incorrect drop chance for "+expectedDrop.getCard()+" on level "+i, blueprintDrop.getDropChance(), is(expectedDrop.getDropChance()));
                assertThat("Incorrect static weight for "+expectedDrop.getCard()+" on level "+i, blueprintDrop.getStaticWeight(), is(expectedDrop.getStaticWeight()));
            }
        }
    }
    
    //@Test
    public void generateLoopDropStoreCode() {
        Hashtable<Integer, Hashtable<String, LootDropDetails>> dropData = parseLootDrops();
        for (int i = 1; i < Level.MAXIMUM_LEVEL; i++) {
            Hashtable<String, LootDropDetails> drops = dropData.get(i);
            if (drops == null || drops.isEmpty()) {
                continue;
            }
            List<LootDropDetails> dropList = new ArrayList<LootDropDetails>();
            dropList.addAll(drops.values());
            Collections.sort(dropList, new LootDropPriorityComparator());
            for (LootDropDetails drop : dropList) {
                System.out.print("addDropDetails(new LootDropDetails(new ");
                System.out.print(drop.getCard().getClass().getSimpleName()+"()");
                if (drop.getCard() instanceof Creature && ((Creature)drop.getCard()).isGold()) {
                    System.out.print(".setGold(true)");
                }
                System.out.print(", ");
                System.out.print("levelStore.getLevel("+drop.getLevel().getLevelNumber()+"), ");
                System.out.print(drop.getDropChance()+", ");
                System.out.print(drop.getStaticWeight());
                System.out.println("));");
            }
        }
    }
    
    //@Test
    public void displayParsedLootDrops() {
        Hashtable<Integer, Hashtable<String, LootDropDetails>> dropData = parseLootDrops();
        for (int i = 1; i < 120; i++) {
            Hashtable<String, LootDropDetails> drops = dropData.get(i);
            if (drops == null || drops.isEmpty()) {
                System.out.println("No drops for level "+i);
                continue;
            }
            System.out.print("Level "+i+": ");
            for (LootDropDetails drop : drops.values()) {
                System.out.print(drop.getCard().getName()+", ");
            }
            System.out.println();
        }
    }
    
    public void displayLootDropsBlueprint() {
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject data = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String deckId = JSONUtils.safeGetString(data, Blueprints.FIELD_DECK_ID);
            if (deckId != null && !deckId.trim().isEmpty()) {
                System.out.println(deckId);
            }
            String landscape = JSONUtils.safeGetString(data, Blueprints.FIELD_LANDSCAPE);
            if (landscape != null && !landscape.trim().isEmpty()) {
                System.out.print(landscape);
            } else {
                System.out.print("??");
            }
            System.out.print(": ");
            String card = JSONUtils.safeGetString(data, Blueprints.FIELD_CARD);
            if (card != null && !card.trim().isEmpty()) {
                System.out.print(card);
            }
            double dropChance = parseDropChance(data);
            double staticWeight = parseStaticWeight(data);
            
            System.out.print(" ["+staticWeight*dropChance+"%, "+dropChance+" chance, "+staticWeight+" weight]");
            System.out.println();
        }
            
    }
    
    protected Hashtable<Integer, Hashtable<String, LootDropDetails>> parseLootDrops() {
        Hashtable<Integer, Hashtable<String, LootDropDetails>> dropData = new Hashtable<Integer, Hashtable<String, LootDropDetails>>();
        int processingLevel = -1;
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject data = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            int newLevelTest = parseLevelNumber(data);
            if (newLevelTest != 0) {
                processingLevel = newLevelTest;
            }
            if (processingLevel == -1) {
                continue;
            }
            double staticWeight = parseStaticWeight(data);
            if (staticWeight == 0) {
                continue;
            }
            double dropChance = parseDropChance(data);
            String cardName = JSONUtils.safeGetString(data, Blueprints.FIELD_CARD);
            Card card = mNameTranslater.getCardByName(cardName);
            if (card == null) {
                // TODO: This should fail the test once we have all creatures
                System.out.println("Could not get card with name "+cardName);
                continue;
            }
            if (!dropData.containsKey(processingLevel)) {
                Hashtable<String, LootDropDetails> drops = new Hashtable<String, LootDropDetails>();
                dropData.put(processingLevel, drops);
            }
            Hashtable<String, LootDropDetails> drops = dropData.get(processingLevel);
            LootDropDetails drop = new LootDropDetails(card, mLevelStore.getLevel(processingLevel), dropChance, staticWeight);
            if (drops.containsKey(card.getId())) {
                //System.out.println("L"+processingLevel+": duplicate "+card.getName());
            } else {
                drops.put(card.getId(), drop);
                //System.out.println("L"+processingLevel+": "+card.getName()+" at "+dropChance+" chance on "+staticWeight+" weight");
            }
        }
        return dropData;
    }
    
    protected int parseLevelNumber(JSONObject data) {
        String deckId = JSONUtils.safeGetString(data, Blueprints.FIELD_DECK_ID);
        if (deckId != null && !deckId.trim().isEmpty() && deckId.startsWith("Quest")) {
            String levelNumber = deckId.replaceAll("Quest", "").replaceAll("_Deck","");
            try {
                return Integer.parseInt(levelNumber);
            } catch (NumberFormatException nfe) {
                System.err.println("Could not parse number from "+levelNumber);
                nfe.printStackTrace();
            }
        }
        return 0;
    }
    
    protected double parseDropChance(JSONObject data) {
        String dropChanceText = JSONUtils.safeGetString(data, Blueprints.FIELD_CHANCE);
        if (dropChanceText != null && !dropChanceText.trim().isEmpty()) {
            double dropChance = JSONUtils.safeGetDouble(data, Blueprints.FIELD_CHANCE, Double.MAX_VALUE);
            if (dropChance != Double.MAX_VALUE) {
                return dropChance;
            }
        }
        return 0;
    }
    
    protected double parseStaticWeight(JSONObject data) {
        String staticWeightText = JSONUtils.safeGetString(data, Blueprints.FIELD_WEIGHT);
        if (staticWeightText != null && !staticWeightText.trim().isEmpty()) {
            double staticWeight = JSONUtils.safeGetDouble(data, Blueprints.FIELD_WEIGHT, Double.MAX_VALUE);
            if (staticWeight != Double.MAX_VALUE) {
                return staticWeight;
            }
        }
        return 0;
    }

}
