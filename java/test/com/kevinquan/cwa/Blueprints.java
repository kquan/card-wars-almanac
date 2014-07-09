package com.kevinquan.cwa;

public interface Blueprints {

    public static final String QUESTS = "db_QuestConditions.json";
    public static final String RECIPES = "db_Fusion.json";
    public static final String LEVELS = "db_Quest.json";
    public static final String BUILDINGS = "db_Buildings.json";
    public static final String SPELLS = "db_Spells.json";
    public static final String LEVEL_DROPS = "db_Decks.json";
    
    public static final String FIELD_ID = "ID";
    public static final String FIELD_FACTION = "Faction";
    public static final String FIELD_RARITY = "Rarity";
    public static final String FIELD_COST = "Cost";
    
    // Levels
    public static final String FIELD_LEVEL_NUMBER = "QuestID";
    public static final String FIELD_OPPONENT = "Opponent";
    public static final String FIELD_QUEST1 = "Condition1";
    public static final String FIELD_QUEST2 = "Condition2";
    public static final String FIELD_QUEST3 = "Condition3";
    
    // Level Drops
    public static final String FIELD_DECK_ID = "DeckID";
    public static final String FIELD_LANDSCAPE = "Landscapes";
    public static final String FIELD_CARD = "Cards";
    public static final String FIELD_CHANCE = "DropChance";
    public static final String FIELD_WEIGHT = "StaticWeight";
}

