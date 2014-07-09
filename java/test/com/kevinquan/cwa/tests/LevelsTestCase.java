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
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    
    @Override
    public void setUp() {
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
            if (levelNumber > 200) {
                // "Special" levels
                continue;
            }
            // Temporary, as not all levels are modeled yet
            if (levelNumber >= mLevelStore.getCount()) {
                System.out.println("Level is greater than known value: "+levelNumber);
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

}
