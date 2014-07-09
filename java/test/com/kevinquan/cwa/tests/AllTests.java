package com.kevinquan.cwa.tests;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
    BuildingsTestCase.class,
    SpellsTestCase.class,
	LevelsTestCase.class,
	QuestsTestCase.class,
	LootDropsTestCase.class,
})
public class AllTests extends TestSuite {}
