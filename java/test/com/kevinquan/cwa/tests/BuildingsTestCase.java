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

public class BuildingsTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = BuildingsTestCase.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    protected JSONArray mBlueprint; 
    protected LevelStore mLevelStore;
    
    @Override
    public void setUp() {
        mBlueprint = readBlueprint(Blueprints.BUILDINGS);
        mNameTranslater = NameTranslater.getInstance();
        mLevelStore = LevelStore.getInstance();
    }
    
    @Test
    public void testBuildingBlueprint() {
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject building = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String buildingName = JSONUtils.safeGetString(building, Blueprints.FIELD_ID); 
            Card buildingCard = mNameTranslater.getCardByName(buildingName);
            assertThat("Could not retrieve building "+buildingName, buildingCard, notNullValue());
            assertThat("Incorrect cost for "+buildingName, JSONUtils.safeGetInt(building, Blueprints.FIELD_COST, Integer.MAX_VALUE), is(buildingCard.getCost()));
            assertThat("Incorrect faction for "+buildingName, NameTranslater.getFaction(building), is(buildingCard.getFaction()));
            assertThat("Incorrect rarity for "+buildingName, NameTranslater.getRarity(building), is(buildingCard.getRarity()));
        }
    }

}
