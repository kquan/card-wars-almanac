package com.kevinquan.cwa.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.CWATestConfiguration;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.cwa.model.levels.Quest;
import com.kevinquan.tests.BaseJUnit4Test;
import com.kevinquan.utils.FileUtils;
import com.kevinquan.utils.JSONUtils;

public class QuestsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = QuestsTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    
    @Override
    public void setUp() {
        File blueprint = new File(CWATestConfiguration.BLUEPRINTS_ROOT_FOLDER, Blueprints.QUESTS);
        if (!blueprint.exists()) {
            fail("Blueprint could not be found at "+blueprint.getAbsolutePath());
            return;
        }
        String blueprintAsString = FileUtils.readFileToString(blueprint);
        assertThat("Blueprint could not be read", blueprintAsString, notNullValue());
        assertThat("Blueprint could not be read", blueprintAsString.trim().isEmpty(), is(false));
        mBlueprint = JSONUtils.safeCreateArray(blueprintAsString);
        assertThat("Blueprint could not be parsed", mBlueprint, notNullValue());
        mNameTranslater = NameTranslater.getInstance();
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
