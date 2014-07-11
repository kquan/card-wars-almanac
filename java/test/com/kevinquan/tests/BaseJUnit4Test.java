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
        mNameTranslater = NameTranslater.getInstance();
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
