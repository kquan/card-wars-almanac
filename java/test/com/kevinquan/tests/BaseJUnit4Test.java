package com.kevinquan.tests;

import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.Before;

import com.kevinquan.cwa.CWATestConfiguration;

public class BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = BaseJUnit4Test.class.getSimpleName();
    
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
}
