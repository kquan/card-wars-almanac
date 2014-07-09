package com.kevinquan.cwa.tests;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
	LevelsTestCase.class,
	QuestsTestCase.class,
})
public class AllTests extends TestSuite {}
