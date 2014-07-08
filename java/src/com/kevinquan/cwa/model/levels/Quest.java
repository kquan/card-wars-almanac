package com.kevinquan.cwa.model.levels;

public class Quest {

    @SuppressWarnings("unused")
    private static final String TAG = Quest.class.getSimpleName();
    
    public static final Quest DEFAULT_FIRST_QUEST = new Quest("Beat your opponent to win a star!");
    
    public static final Quest CORN_ONLY = new Quest("Beat the opponent using only Corn cards");
    public static final Quest NICE_ONLY = new Quest("Beat the opponent using only Nice Lands cards");
    public static final Quest PLAINS_ONLY = new Quest("Beat the opponent using only Blue Plains cards");
    public static final Quest RAINBOW_ONLY = new Quest("Beat the opponent using only Rainbow cards");
    public static final Quest SANDY_ONLY = new Quest("Beat the opponent using only Sandy Lands cards");
    public static final Quest SWAMP_ONLY = new Quest("Beat the opponent using only Useless Swamp cards");
    public static final Quest CORN_FORBIDDEN = new Quest("TBA");
    public static final Quest PLAINS_FORBIDDEN = new Quest("TBA");
    public static final Quest SWAMP_FORBIDDEN = new Quest("TBA");
    public static final Quest SANDY_FORBIDDEN = new Quest("TBA");
    public static final Quest NICE_FORBIDDEN = new Quest("TBA");
    public static final Quest RAINBOW_FORBIDDEN = new Quest("TBA");
    
    public static final Quest NO_CREATURES = new Quest("Beat the opponent without using Creature cards"); // Check
    public static final Quest NO_BUILDINGS = new Quest("Beat the opponent without using Building cards");
    public static final Quest NO_SPELLS = new Quest("Beat the opponent without using Spell cards");
    
    public static final Quest ONLY_SPELLS = new Quest("TBA");
    public static final Quest ONLY_CREATURES = new Quest("TBA");
    
    public static final Quest LANDSCAPES_TWO_DIFFERENT = new Quest("Use two different landscapes"); // Check
    public static final Quest LANDSCAPES_THREE_DIFFERENT = new Quest("Use three different landscapes");
    public static final Quest LANDSCAPES_FOUR_DIFFERENT = new Quest("Use four different landscapes");
    
    public static final Quest LOSE_5HP_MAX = new Quest("Don't lose more than 5 HP on your Hero");
    public static final Quest LOSE_10HP_MAX = new Quest("Don't lose more than 10 HP on your Hero"); // Check
    public static final Quest LOSE_25HP_MAX = new Quest("Don't lose more than 25 HP on your Hero"); // Check
    public static final Quest LOSE_50HP_MAX = new Quest("Don't lose more than 50 HP on your Hero"); // Check
    public static final Quest LOSE_100HP_MAX = new Quest("Don't lose more than 100 HP on your Hero"); // Check
    
    public static final Quest LOSE_2_CREATURES_MAX = new Quest("TBA");
    public static final Quest LOSE_3_CREATURES_MAX = new Quest("TBA");
    public static final Quest LOSE_5_CREATURES_MAX = new Quest("TBA");
    public static final Quest LOSE_10_CREATURES_MAX = new Quest("TBA");
    
    public static final Quest WIN_IN_3_TURNS = new Quest("TBA");
    public static final Quest WIN_IN_5_TURNS = new Quest("TBA");
    public static final Quest WIN_IN_7_TURNS = new Quest("TBA");
    public static final Quest WIN_IN_10_TURNS = new Quest("TBA");
    
    public static final Quest DEFEAT_2_CREATURES = new Quest("TBA");
    public static final Quest DEFEAT_5_CREATURES = new Quest("TBA");
    public static final Quest DEFEAT_10_CREATURES = new Quest("TBA");
    public static final Quest DEFEAT_15_CREATURES = new Quest("TBA");
    public static final Quest DEFEAT_20_CREATURES = new Quest("TBA");
    public static final Quest DEFEAT_25_CREATURES = new Quest("TBA");
    
    public static final Quest ONLY_0_POINT_CARDS = new Quest("TBA");
    public static final Quest ONLY_1_POINT_CARDS = new Quest("TBA");
    public static final Quest ONLY_2_POINT_CARDS = new Quest("TBA");
    public static final Quest ONLY_3_POINT_CARDS = new Quest("TBA");
    
    public static final Quest ONLY_10_POINTS = new Quest("TBA");
    public static final Quest ONLY_15_POINTS = new Quest("TBA");
    public static final Quest ONLY_20_POINTS = new Quest("TBA");
    public static final Quest ONLY_25_POINTS = new Quest("TBA");
    
    public static final Quest COST_30_MAX = new Quest("TBA");
    
    protected String mDescription;
    
    public Quest(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

}
