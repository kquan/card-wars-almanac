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
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.CardStore;
import com.kevinquan.cwa.model.MasterCardStore;
import com.kevinquan.cwa.model.creatures.Creature;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class CreaturesTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = CreaturesTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected CardStore mStore;
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.CREATURES);
        mNameTranslater = NameTranslater.getInstance();
        mStore = MasterCardStore.getInstance();
    }
    
    @Test
    public void testCreaturesBlueprint() {
        // Re-enable once all creatures are translated
        //assertThat("Incorrect creature count", mBlueprint.length(), is(mNameTranslater.getCardCount("Creature_")));
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject creature = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String creatureName = JSONUtils.safeGetString(creature, Blueprints.FIELD_ID); 
            Card card = mNameTranslater.getCardByName(creatureName);
            if (!(card instanceof Creature)) {
                fail("Card was not a creature for "+creatureName);
            }
            Creature creatureCard = (Creature)card;
            assertThat("Incorrect cost for "+creatureName, JSONUtils.safeGetInt(creature, Blueprints.FIELD_COST, Integer.MAX_VALUE), is(creatureCard.getCost()));
            assertThat("Incorrect faction for "+creatureName, NameTranslater.getFaction(creature), is(creatureCard.getFaction()));
            assertThat("Incorrect rarity for "+creatureName, NameTranslater.getRarity(creature), is(creatureCard.getRarity()));
            assertThat("Incorrect attack for "+creatureName, JSONUtils.safeGetInt(creature, Blueprints.FIELD_ATTACK, -1), is(creatureCard.getInitialAttack()));
            assertThat("Incorrect defense for "+creatureName, JSONUtils.safeGetInt(creature, Blueprints.FIELD_DEFENSE, -1), is(creatureCard.getInitialDefense()));
            assertThat("Incorrect floop cost for "+creatureName, JSONUtils.safeGetInt(creature, Blueprints.FIELD_FLOOP_COST, -1), is(creatureCard.getFloopCost()));
        }
    }

}
