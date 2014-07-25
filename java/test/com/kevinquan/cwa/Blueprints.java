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
package com.kevinquan.cwa;

public interface Blueprints {

    public static final String QUESTS = "db_QuestConditions.json";
    public static final String RECIPES = "db_Fusion.json";
    public static final String LEVELS = "db_Quest.json";
    public static final String CREATURES = "db_Creatures.json";
    public static final String BUILDINGS = "db_Buildings.json";
    public static final String SPELLS = "db_Spells.json";
    public static final String LEVEL_DROPS = "db_Decks.json";
    
    public static final String FIELD_ID = "ID";
    public static final String FIELD_FACTION = "Faction";
    public static final String FIELD_RARITY = "Rarity";
    public static final String FIELD_COST = "Cost";
    
    // Creatures
    public static final String FIELD_ATTACK = "ATK";
    public static final String FIELD_DEFENSE = "DEF";
    public static final String FIELD_FLOOP_COST = "FloopCost";
    
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
    
    // Recipes
    public static final String FIELD_RECIPE_UNLOCK_LEVEL = "Quest_Unlock";
    public static final String FIELD_RESULT_CARD = "Card_ID";
    public static final String FIELD_RECIPE_CARD1 = "C1_Name";
    public static final String FIELD_RECIPE_CARD1_COUNT = "C1_Count";
    public static final String FIELD_RECIPE_CARD2 = "C2_Name";
    public static final String FIELD_RECIPE_CARD2_COUNT = "C2_Count";
    public static final String FIELD_RECIPE_CARD3 = "C3_Name";
    public static final String FIELD_RECIPE_CARD3_COUNT = "C3_Count";
    public static final String FIELD_RECIPE_CARD4 = "C4_Name";
    public static final String FIELD_RECIPE_CARD4_COUNT = "C4_Count";
    public static final String FIELD_RECIPE_CARD5 = "C5_Name";
    public static final String FIELD_RECIPE_CARD5_COUNT = "C5_Count";
}

