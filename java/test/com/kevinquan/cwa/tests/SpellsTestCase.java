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

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.levels.LevelStore;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class SpellsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = SpellsTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.SPELLS);
        mNameTranslater = NameTranslater.getInstance();
        mLevelStore = LevelStore.getInstance();
    }
    
    @Test
    public void testSpellsBlueprint() {
        //assertThat("Incorrect spells count", mBlueprint.length(), is(mNameTranslater.getCardCount("Spell_")));
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject spell = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String spellName = JSONUtils.safeGetString(spell, Blueprints.FIELD_ID);
            Card spellCard = mNameTranslater.getCardByName(spellName);
            assertThat("Could not retrieve spell "+spellName, spellCard, notNullValue());
            assertThat("Incorrect cost for "+spellName, JSONUtils.safeGetInt(spell, Blueprints.FIELD_COST, Integer.MAX_VALUE), is(spellCard.getCost()));
            assertThat("Incorrect faction for "+spellName, NameTranslater.getFaction(spell), is(spellCard.getFaction()));
            assertThat("Incorrect rarity for "+spellName, NameTranslater.getRarity(spell), is(spellCard.getRarity()));
        }
    }

}
