package com.kevinquan.cwa;

import java.util.Hashtable;

import com.kevinquan.cwa.model.levels.Quest;

public class NameTranslater {

    @SuppressWarnings("unused")
    private static final String TAG = NameTranslater.class.getSimpleName();

    private static class NameTranslaterHolder {
        private static final NameTranslater INSTANCE = new NameTranslater();
    }
    
    public static NameTranslater getInstance() {
        return NameTranslaterHolder.INSTANCE;
    }
    
    protected Hashtable<String, Quest> mQuestConditions;
    
    private NameTranslater() {
        mQuestConditions = new Hashtable<String, Quest>();
        initQuests();
    }
    
    protected void initQuests() {
        mQuestConditions.put("JustWin", Quest.DEFAULT_FIRST_QUEST);
        mQuestConditions.put("Forbid_Corn", Quest.CORN_FORBIDDEN);
        mQuestConditions.put("Forbid_Plains", Quest.PLAINS_FORBIDDEN);
        mQuestConditions.put("Forbid_Swamp", Quest.SWAMP_FORBIDDEN);
        mQuestConditions.put("Forbid_Cotton", Quest.NICE_FORBIDDEN);
        mQuestConditions.put("Forbid_Sand", Quest.SANDY_FORBIDDEN);
        mQuestConditions.put("Forbid_Universal", Quest.RAINBOW_FORBIDDEN);
        mQuestConditions.put("Only_Corn", Quest.CORN_ONLY);
        mQuestConditions.put("Only_Plains", Quest.PLAINS_ONLY);
        mQuestConditions.put("Only_Swamp", Quest.SWAMP_ONLY);
        mQuestConditions.put("Only_Cotton", Quest.NICE_ONLY);
        mQuestConditions.put("Only_Sand", Quest.SANDY_ONLY);
        mQuestConditions.put("Only_Universal", Quest.RAINBOW_ONLY);
        mQuestConditions.put("FastWin3", Quest.WIN_IN_3_TURNS);
        mQuestConditions.put("FastWin5", Quest.WIN_IN_5_TURNS);
        mQuestConditions.put("FastWin7", Quest.WIN_IN_7_TURNS);
        mQuestConditions.put("FastWin10", Quest.WIN_IN_10_TURNS);
        mQuestConditions.put("Forbid_Spells", Quest.NO_SPELLS);
        mQuestConditions.put("Forbid_Creatures", Quest.NO_CREATURES);
        mQuestConditions.put("Forbid_Buildings", Quest.NO_BUILDINGS);
        mQuestConditions.put("Only_Spells", Quest.ONLY_SPELLS);
        mQuestConditions.put("Only_Creatures", Quest.ONLY_CREATURES);
        mQuestConditions.put("Defeat2", Quest.DEFEAT_2_CREATURES);
        mQuestConditions.put("Defeat5", Quest.DEFEAT_5_CREATURES);
        // this is a typo in the blueprint
        mQuestConditions.put("Deafeat10", Quest.DEFEAT_10_CREATURES); 
        mQuestConditions.put("Defeat15", Quest.DEFEAT_15_CREATURES);
        mQuestConditions.put("Defeat20", Quest.DEFEAT_20_CREATURES);
        mQuestConditions.put("Defeat25", Quest.DEFEAT_25_CREATURES);
        mQuestConditions.put("Only0PointCards", Quest.ONLY_0_POINT_CARDS);
        mQuestConditions.put("Only1PointCards", Quest.ONLY_1_POINT_CARDS);
        mQuestConditions.put("Only2PointCards", Quest.ONLY_2_POINT_CARDS);
        mQuestConditions.put("Only3PointCards", Quest.ONLY_3_POINT_CARDS);
        mQuestConditions.put("Only10Points", Quest.ONLY_10_POINTS);
        mQuestConditions.put("Only15Points", Quest.ONLY_15_POINTS);
        mQuestConditions.put("Only20Points", Quest.ONLY_20_POINTS);
        mQuestConditions.put("Only25Points", Quest.ONLY_25_POINTS);
        mQuestConditions.put("Only5HP", Quest.LOSE_5HP_MAX);
        mQuestConditions.put("Only10HP", Quest.LOSE_10HP_MAX);
        mQuestConditions.put("Only25HP", Quest.LOSE_25HP_MAX);
        mQuestConditions.put("Only50HP", Quest.LOSE_50HP_MAX);
        mQuestConditions.put("Only100HP", Quest.LOSE_100HP_MAX);
        mQuestConditions.put("OnlyLose2Creatures", Quest.LOSE_2_CREATURES_MAX);
        mQuestConditions.put("OnlyLose3Creatures", Quest.LOSE_3_CREATURES_MAX);
        mQuestConditions.put("OnlyLose5Creatures", Quest.LOSE_5_CREATURES_MAX);
        mQuestConditions.put("OnlyLose10Creatures", Quest.LOSE_10_CREATURES_MAX);
        mQuestConditions.put("Landscapes_Four", Quest.LANDSCAPES_FOUR_DIFFERENT);
        mQuestConditions.put("Landscapes_Three", Quest.LANDSCAPES_THREE_DIFFERENT);
        mQuestConditions.put("Landscapes_Two", Quest.LANDSCAPES_TWO_DIFFERENT);
        mQuestConditions.put("MaxCost30", Quest.COST_30_MAX);
    }
    
    public Quest getQuestByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        return mQuestConditions.get(name);
    }
    
    public int getQuestCount() {
        return mQuestConditions.values().size();
    }
}
