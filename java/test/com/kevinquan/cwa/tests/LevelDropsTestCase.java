package com.kevinquan.cwa.tests;

import java.util.Hashtable;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.levels.LevelStore;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class LevelDropsTestCase extends BaseJUnit4Test {
    
    protected static class LevelDrop {
        
        protected Card mCard;
        protected double mDropChance;
        protected double mStaticWeight;
        
        public LevelDrop(Card card, double chance, double weight) {
            mCard = card;
            mDropChance = chance;
            mStaticWeight = weight;
        }

        public Card getCard() {
            return mCard;
        }

        public double getDropChance() {
            return mDropChance;
        }

        public double getStaticWeight() {
            return mStaticWeight;
        }
    }

    @SuppressWarnings("unused")
    private static final String TAG = LevelDropsTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    
    @Override
    public void setUp() {
        mBlueprint = readBlueprint(Blueprints.LEVEL_DROPS);
        mNameTranslater = NameTranslater.getInstance();
        mLevelStore = LevelStore.getInstance();
    }
    
    @Test
    public void testParseLevelDropsBlueprint() {
        Hashtable<Integer, Hashtable<String, LevelDrop>> dropData = new Hashtable<Integer, Hashtable<String, LevelDrop>>();
        int lastLevel = -1;
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject data = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            int newLevelTest = parseLevel(data);
            if (newLevelTest != 0) {
                lastLevel = newLevelTest;
            }
            if (lastLevel == -1) {
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
                System.out.println("Could not get card with name "+cardName);
                continue;
            }
            if (!dropData.containsKey(lastLevel)) {
                Hashtable<String, LevelDrop> drops = new Hashtable<String, LevelDrop>();
                dropData.put(lastLevel, drops);
            }
            Hashtable<String, LevelDrop> drops = dropData.get(lastLevel);
            LevelDrop drop = new LevelDrop(card, dropChance, staticWeight);
            if (drops.containsKey(card.getId())) {
                //System.out.println("L"+lastLevel+": duplicate "+card.getName());
            } else {
                drops.put(card.getId(), drop);
                //System.out.println("L"+lastLevel+": "+card.getName()+" at "+dropChance+" chance on "+staticWeight+" weight");
            }
        }
        
        // Display
        for (int i = 1; i < 120; i++) {
            Hashtable<String, LevelDrop> drops = dropData.get(i);
            if (drops == null || drops.isEmpty()) {
                System.out.println("No drops for level "+i);
                continue;
            }
            System.out.print("Level "+i+": ");
            for (LevelDrop drop : drops.values()) {
                System.out.print(drop.getCard().getName()+", ");
            }
            System.out.println();
        }
    }
    
    public void testDisplayLevelDropsBlueprint() {
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
            if (i > 1000) break;
        }
            
    }
    
    protected int parseLevel(JSONObject data) {
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
