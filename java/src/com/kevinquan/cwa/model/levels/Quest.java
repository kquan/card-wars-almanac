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
    public static final Quest NO_BUILDINGS = new Quest("Beat the opponent without using Building cards");
    public static final Quest NO_SPELLS = new Quest("Beat the opponent without using Spell cards");
    public static final Quest LANDSCAPES_THREE_DIFFERENT = new Quest("Use three different landscapes");
    public static final Quest LANDSCAPES_FOUR_DIFFERENT = new Quest("Use four different landscapes");
    public static final Quest LOSE_5HP_MAX = new Quest("Don't lose more than 5 HP on your Hero");
    
    protected String mDescription;
    
    public Quest(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

}
