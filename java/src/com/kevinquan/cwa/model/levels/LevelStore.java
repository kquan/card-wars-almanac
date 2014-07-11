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
package com.kevinquan.cwa.model.levels;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.hero.Hero;
import com.kevinquan.cwa.model.levels.Level.Area;

public class LevelStore {

    private static class LevelStoreHolder {
        private static final LevelStore INSTANCE = new LevelStore();
    }

    @SuppressWarnings("unused")
    private static final String TAG = LevelStore.class.getSimpleName();
    
    public static LevelStore getInstance() {
        return LevelStoreHolder.INSTANCE;
    }
    
    protected List<Level> mLevels;
    
    private LevelStore() {
        mLevels = new ArrayList<Level>();
        init();
    }
    
    protected LevelStore addLevel(Level level) {
        mLevels.add(level);
        return this;
    }
    
    public List<Level> getAllLevels() {
        List<Level> shallowCopy = new ArrayList<Level>();
        shallowCopy.addAll(mLevels);
        return shallowCopy;
    }
    
    public int getCount() {
        return mLevels.size();
    }
    
    public Level getLevel(int levelNumber) {
        if (levelNumber > 0 && levelNumber < mLevels.size()+1) {
            // Level 1 is at index 0
            return mLevels.get(levelNumber-1);
        }
        return null;
    }
    
    protected void init() {       
        addLevel(new Level(1, 1, Hero.FINN, 1, Area.Treehouse)
                .addQuest(2, Quest.WIN_IN_5_TURNS)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(2, 1, Hero.FINN, 1, Area.Treehouse)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(3, 1, Hero.FINN, 1, Area.Treehouse)
                .addQuest(2, Quest.LOSE_5HP_MAX)
                .addQuest(3, Quest.PLAINS_ONLY));
        addLevel(new Level(4, 1, Hero.BMO, 2, Area.Treehouse)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.LANDSCAPES_THREE_DIFFERENT));
        addLevel(new Level(5, 1, Hero.BMO, 2, Area.Treehouse)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(6, 1, Hero.BMO, 2, Area.Treehouse)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(7, 1, Hero.MARCELINE, 3, Area.Treehouse)
                .addQuest(2, Quest.WIN_IN_5_TURNS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(8, 1, Hero.MARCELINE, 3, Area.Treehouse)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(9, 1, Hero.MARCELINE, 3, Area.Treehouse)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(10, 1, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(11, 1, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(12, 2, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse)
                .addQuest(2, Quest.LOSE_5HP_MAX)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(13, 1, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.PLAINS_ONLY));
        addLevel(new Level(14, 1, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(15, 2, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(16, 1, Hero.LADY_RAINICORN, 6, Area.Forest)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(17, 1, Hero.LADY_RAINICORN, 6, Area.Forest)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(18, 2, Hero.LADY_RAINICORN, 6, Area.Forest)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(19, 2, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.LOSE_2_CREATURES_MAX));
        addLevel(new Level(20, 2, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(21, 3, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(22, 2, Hero.ASH, 8, Area.Forest)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(23, 2, Hero.ASH, 8, Area.Forest)
                .addQuest(2, Quest.LANDSCAPES_FOUR_DIFFERENT)
                .addQuest(3, Quest.LOSE_2_CREATURES_MAX));
        addLevel(new Level(24, 3, Hero.ASH, 8, Area.Forest)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(25, 2, Hero.RICARDIO, 9, Area.Forest)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(26, 2, Hero.RICARDIO, 9, Area.Forest)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(27, 3, Hero.RICARDIO, 9, Area.Forest)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(28, 2, Hero.DR_DONUT, 10, Area.Forest)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(29, 2, Hero.DR_DONUT, 10, Area.Forest)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(30, 3, Hero.DR_DONUT, 10, Area.Forest)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(31, 2, Hero.FINN, 11, Area.CandyKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(32, 2, Hero.FINN, 11, Area.CandyKingdom)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.PLAINS_ONLY));
        addLevel(new Level(33, 3, Hero.FINN, 11, Area.CandyKingdom)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(34, 3, Hero.LADY_RAINICORN, 12, Area.CandyKingdom)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_10HP_MAX));
        addLevel(new Level(35, 3, Hero.LADY_RAINICORN, 12, Area.CandyKingdom)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.NICE_ONLY));
        addLevel(new Level(36, 4, Hero.LADY_RAINICORN, 12, Area.CandyKingdom)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(37, 3, Hero.PRINCESS_BUBBLEGUM, 13, Area.CandyKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(38, 3, Hero.PRINCESS_BUBBLEGUM, 13, Area.CandyKingdom)
                .addQuest(2, Quest.LOSE_10HP_MAX)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(39, 4, Hero.PRINCESS_BUBBLEGUM, 13, Area.CandyKingdom)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(40, 3, Hero.JAKE, 14, Area.CandyKingdom)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_10HP_MAX));
        addLevel(new Level(41, 3, Hero.JAKE, 14, Area.CandyKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.SWAMP_ONLY));
        addLevel(new Level(42, 4, Hero.JAKE, 14, Area.CandyKingdom)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.NICE_ONLY));
        addLevel(new Level(43, 3, Hero.EARL_OF_LEMONGRAB, 15, Area.CandyKingdom)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(44, 3, Hero.EARL_OF_LEMONGRAB, 15, Area.CandyKingdom)
                .addQuest(2, Quest.LOSE_2_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_10HP_MAX));
        addLevel(new Level(45, 4, Hero.EARL_OF_LEMONGRAB, 15, Area.CandyKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(46, 3, Hero.BMO, 16, Area.Beach)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(47, 3, Hero.BMO, 16, Area.Beach)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.ONLY_CREATURES));
        addLevel(new Level(48, 4, Hero.BMO, 16, Area.Beach)
                .addQuest(2, Quest.LOSE_25HP_MAX)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(49, 4, Hero.LUMPY_SPACE_PRINCESS, 17, Area.Beach)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(50, 4, Hero.LUMPY_SPACE_PRINCESS, 17, Area.Beach)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(51, 5, Hero.LUMPY_SPACE_PRINCESS, 17, Area.Beach)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.LOSE_2_CREATURES_MAX));
        addLevel(new Level(52, 4, Hero.MARCELINE, 18, Area.Beach)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(53, 4, Hero.MARCELINE, 18, Area.Beach)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(54, 5, Hero.MARCELINE, 18, Area.Beach)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(55, 4, Hero.RICARDIO, 19, Area.Beach)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(56, 4, Hero.RICARDIO, 19, Area.Beach)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(57, 5, Hero.RICARDIO, 19, Area.Beach)
                .addQuest(2, Quest.LOSE_25HP_MAX)
                .addQuest(3, Quest.LOSE_2_CREATURES_MAX));
        addLevel(new Level(58, 4, Hero.FLAME_PRINCESS, 20, Area.Beach)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(59, 4, Hero.FLAME_PRINCESS, 20, Area.Beach)
                .addQuest(2, Quest.WIN_IN_5_TURNS)
                .addQuest(3, Quest.NICE_ONLY));
        addLevel(new Level(60, 5, Hero.FLAME_PRINCESS, 20, Area.Beach)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(61, 4, Hero.HUNSON_ABADEER, 21, Area.MarcelineCave)
                .addQuest(2, Quest.LOSE_25HP_MAX)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(62, 4, Hero.HUNSON_ABADEER, 21, Area.MarcelineCave)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(63, 5, Hero.HUNSON_ABADEER, 21, Area.MarcelineCave)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(64, 5, Hero.JAKE, 22, Area.MarcelineCave)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(65, 5, Hero.JAKE, 22, Area.MarcelineCave)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(66, 6, Hero.JAKE, 22, Area.MarcelineCave)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(67, 5, Hero.MARCELINE, 23, Area.MarcelineCave)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(68, 5, Hero.MARCELINE, 23, Area.MarcelineCave)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(69, 6, Hero.MARCELINE, 23, Area.MarcelineCave)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(70, 5, Hero.BMO, 24, Area.MarcelineCave)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(71, 5, Hero.BMO, 24, Area.MarcelineCave)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(72, 6, Hero.BMO, 24, Area.MarcelineCave)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(73, 5, Hero.ASH, 25, Area.MarcelineCave)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(74, 5, Hero.ASH, 25, Area.MarcelineCave)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(75, 6, Hero.ASH, 25, Area.MarcelineCave)
                .addQuest(2, Quest.LANDSCAPES_FOUR_DIFFERENT)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(76, 5, Hero.FLAME_PRINCESS, 25, Area.IceKingdom)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(77, 5, Hero.FLAME_PRINCESS, 25, Area.IceKingdom)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(78, 6, Hero.FLAME_PRINCESS, 25, Area.IceKingdom)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(79, 6, Hero.JAKE, 25, Area.IceKingdom)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(80, 6, Hero.JAKE, 25, Area.IceKingdom)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(81, 7, Hero.JAKE, 25, Area.IceKingdom)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(82, 6, Hero.FINN, 25, Area.IceKingdom)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(83, 6, Hero.FINN, 25, Area.IceKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(84, 7, Hero.FINN, 25, Area.IceKingdom)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.PLAINS_ONLY));
        addLevel(new Level(85, 6, Hero.GUNTER, 25, Area.IceKingdom)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(86, 6, Hero.GUNTER, 25, Area.IceKingdom)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.LOSE_25HP_MAX));
        addLevel(new Level(87, 7, Hero.GUNTER, 25, Area.IceKingdom)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.NICE_ONLY));
        addLevel(new Level(88, 6, Hero.ICE_KING, 25, Area.IceKingdom)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(89, 6, Hero.ICE_KING, 25, Area.IceKingdom)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(90, 7, Hero.ICE_KING, 25, Area.IceKingdom)
                .addQuest(2, Quest.LOSE_25HP_MAX)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(91, 6, Hero.FLAME_PRINCESS, 26, Area.Desert)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(92, 6, Hero.FLAME_PRINCESS, 26, Area.Desert)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(93, 7, Hero.FLAME_PRINCESS, 27, Area.Desert)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(94, 7, Hero.RICARDIO, 27, Area.Desert)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(95, 7, Hero.RICARDIO, 27, Area.Desert)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(96, 8, Hero.RICARDIO, 28, Area.Desert)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(97, 7, Hero.FINN_DOCTOR, 28, Area.Desert)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(98, 7, Hero.FINN_DOCTOR, 28, Area.Desert)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.NO_BUILDINGS));
        addLevel(new Level(99, 8, Hero.FINN_DOCTOR, 29, Area.Desert)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(100, 7, Hero.LADY_RAINICORN, 29, Area.Desert)
                .addQuest(2, Quest.RAINBOW_ONLY)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(101, 7, Hero.LADY_RAINICORN, 29, Area.Desert)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(102, 8, Hero.LADY_RAINICORN, 30, Area.Desert)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.CORN_ONLY));
        addLevel(new Level(103, 7, Hero.MAGIC_MAN, 30, Area.Desert)
                .addQuest(2, Quest.NO_SPELLS)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(104, 7, Hero.MAGIC_MAN, 30, Area.Desert)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(105, 8, Hero.MAGIC_MAN, 31, Area.Desert)
                .addQuest(2, Quest.LANDSCAPES_FOUR_DIFFERENT)
                .addQuest(3, Quest.LOSE_3_CREATURES_MAX));
        addLevel(new Level(106, 7, Hero.MARCELINE, 31, Area.DarkForest)
                .addQuest(2, Quest.PLAINS_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(107, 7, Hero.MARCELINE, 31, Area.DarkForest)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(108, 8, Hero.MARCELINE, 32, Area.DarkForest)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.SANDY_ONLY));
        addLevel(new Level(109, 8, Hero.HUNSON_ABADEER, 32, Area.DarkForest)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(110, 8, Hero.HUNSON_ABADEER, 32, Area.DarkForest)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(111, 9, Hero.HUNSON_ABADEER, 33, Area.DarkForest)
                .addQuest(2, Quest.ONLY_CREATURES)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(112, 8, Hero.LUMPY_SPACE_PRINCESS, 33, Area.DarkForest)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.ONLY_CREATURES));
        addLevel(new Level(113, 8, Hero.LUMPY_SPACE_PRINCESS, 33, Area.DarkForest)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(114, 9, Hero.LUMPY_SPACE_PRINCESS, 34, Area.DarkForest)
                .addQuest(2, Quest.CORN_ONLY)
                .addQuest(3, Quest.PLAINS_ONLY));
        addLevel(new Level(115, 8, Hero.FINN_PAJAMA, 34, Area.DarkForest)
                .addQuest(2, Quest.NO_BUILDINGS)
                .addQuest(3, Quest.NO_SPELLS));
        addLevel(new Level(116, 8, Hero.FINN_PAJAMA, 34, Area.DarkForest)
                .addQuest(2, Quest.LOSE_3_CREATURES_MAX)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(117, 9, Hero.FINN_PAJAMA, 35, Area.DarkForest)
                .addQuest(2, Quest.SANDY_ONLY)
                .addQuest(3, Quest.NICE_ONLY));
        addLevel(new Level(118, 8, Hero.PEPPERMINT_BUTLER, 35, Area.DarkForest)
                .addQuest(2, Quest.SWAMP_ONLY)
                .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(119, 8, Hero.PEPPERMINT_BUTLER, 35, Area.DarkForest)
                .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT)
                .addQuest(3, Quest.WIN_IN_5_TURNS));
        addLevel(new Level(120, 9, Hero.PEPPERMINT_BUTLER, 36, Area.DarkForest)
                .addQuest(2, Quest.NICE_ONLY)
                .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
    }
}
