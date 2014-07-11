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
import com.kevinquan.cwa.model.hero.Hero;
import com.kevinquan.cwa.model.levels.Level;
import com.kevinquan.cwa.model.levels.LevelStore;
import com.kevinquan.cwa.model.levels.Quest;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class LevelsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = LevelsTestCase.class.getSimpleName();
    
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.LEVELS);
        mLevelStore = LevelStore.getInstance();
    }
    
    @Test
    public void testLevelsBlueprint() {
        // Cannot test for this as blueprint has "special" levels
        //assertThat("Incorrect level count", mBlueprint.length(), is(mLevelStore.getCount()));
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject level = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            int levelNumber = JSONUtils.safeGetInt(level, Blueprints.FIELD_LEVEL_NUMBER, 0);
            if (levelNumber > Level.MAXIMUM_LEVEL) {
                // "Special" levels
                continue;
            }
            Level modelLevel = mLevelStore.getLevel(levelNumber);
            assertThat("Could not retrieve level "+levelNumber, modelLevel, notNullValue());
            String opponent = JSONUtils.safeGetString(level, Blueprints.FIELD_OPPONENT);
            Hero hero = mNameTranslater.getHeroByName(opponent);
            assertThat("No known hero for "+opponent, hero, notNullValue());
            assertThat("Incorrect hero for level "+levelNumber, hero, is(modelLevel.getOpponent()));
            Quest quest1 = mNameTranslater.getQuestByName(JSONUtils.safeGetString(level, Blueprints.FIELD_QUEST1));
            assertThat("Incorrect quest1 for level "+levelNumber, quest1, is(modelLevel.getQuest(1)));
            Quest quest2 = mNameTranslater.getQuestByName(JSONUtils.safeGetString(level, Blueprints.FIELD_QUEST2));
            assertThat("Incorrect quest2 for level "+levelNumber, quest2, is(modelLevel.getQuest(2)));
            Quest quest3 = mNameTranslater.getQuestByName(JSONUtils.safeGetString(level, Blueprints.FIELD_QUEST3));
            assertThat("Incorrect quest3 for level "+levelNumber, quest3, is(modelLevel.getQuest(3)));
        }
        
    }
    
    public void generateLevelsCode() {
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject level = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            int levelNumber = JSONUtils.safeGetInt(level, Blueprints.FIELD_LEVEL_NUMBER, 0);
            if (levelNumber > Level.MAXIMUM_LEVEL) {
                // "Special" levels
                continue;
            }
            System.out.println("addLevel(new Level("+levelNumber+", "+JSONUtils.safeGetInt(level, "Stamina", -1)+", "+NameTranslater.getOpponent(level)+", "+JSONUtils.safeGetInt(level, "LeaderLevel", -1)+", "+NameTranslater.getArea(level)+")");
            System.out.println("\t\t\t\t.addQuest(2, "+NameTranslater.getQuest(level, Blueprints.FIELD_QUEST2)+")");
            System.out.println("\t\t\t\t.addQuest(3, "+NameTranslater.getQuest(level, Blueprints.FIELD_QUEST3)+"));");
        }
    }

}
