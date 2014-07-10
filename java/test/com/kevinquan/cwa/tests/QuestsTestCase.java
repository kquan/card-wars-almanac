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
