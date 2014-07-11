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
import com.kevinquan.cwa.model.levels.Quest;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class QuestsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = QuestsTestCase.class.getSimpleName();
    
    protected JSONArray mBlueprint; 
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.QUESTS);
    }
    
    @Test
    public void testQuestBlueprint() {
        assertThat("Incorrect blueprint count", mBlueprint.length(), is(mNameTranslater.getQuestCount()));
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject questCondition = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String questName = JSONUtils.safeGetString(questCondition, Blueprints.FIELD_ID);
            if (questName == null) {
                System.out.println("Could not retrieve quest name from "+questCondition);
                continue;
            }
            Quest quest = mNameTranslater.getQuestByName(questName);
            assertThat("Could not retrieve quest with name "+questName, quest, notNullValue());
        }
    }

}
