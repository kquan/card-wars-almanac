package com.kevinquan.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;

import org.json.JSONArray;
import org.junit.After;
import org.junit.Before;

import com.kevinquan.cwa.CWATestConfiguration;
import com.kevinquan.cwa.NameTranslater;
import com.kevinquan.java.utils.FileUtils;
import com.kevinquan.java.utils.JSONUtils;

public class BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = BaseJUnit4Test.class.getSimpleName();
    
    protected NameTranslater mNameTranslater;
    
    @Before
    public void setUp() {
        File blueprintsRoot = new File(CWATestConfiguration.BLUEPRINTS_ROOT_FOLDER);
        if (!blueprintsRoot.exists() && !blueprintsRoot.isDirectory()) {
            fail("Blueprints root could not be found.");
        }
    }
    
    @After
    public void tearDown() {
        
    }
    
    protected JSONArray readBlueprint(String blueprintPath) {
        File blueprint = new File(CWATestConfiguration.BLUEPRINTS_ROOT_FOLDER, blueprintPath);
        if (!blueprint.exists()) {
            fail("Blueprint could not be found at "+blueprint.getAbsolutePath());
        }
        String blueprintAsString = FileUtils.readFileToString(blueprint);
        assertThat("Blueprint could not be read", blueprintAsString, notNullValue());
        assertThat("Blueprint could not be read", blueprintAsString.trim().isEmpty(), is(false));
        JSONArray blueprintObject = JSONUtils.safeCreateArray(blueprintAsString);
        assertThat("Blueprint could not be parsed", blueprintObject, notNullValue());
        return blueprintObject;
    }
}
