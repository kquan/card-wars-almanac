package com.kevinquan.cwa.model.levels;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.hero.Hero;
import com.kevinquan.cwa.model.levels.Level.Area;

public class LevelStore {

    @SuppressWarnings("unused")
    private static final String TAG = LevelStore.class.getSimpleName();

    private static class LevelStoreHolder {
        private static final LevelStore INSTANCE = new LevelStore();
    }
    
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
    }
    
    public Level getLevel(int levelNumber) {
        if (levelNumber > 0 && levelNumber < mLevels.size()) {
            // Level 1 is at index 0
            return mLevels.get(levelNumber-1);
        }
        return null;
    }
    
    public int getCount() {
        return mLevels.size();
    }
}
