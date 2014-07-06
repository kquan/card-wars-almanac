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
        addLevel(new Level(1, 1, Hero.FINN, 1, Area.Treehouse));
        addLevel(new Level(2, 1, Hero.FINN, 1, Area.Treehouse));
        addLevel(new Level(3, 1, Hero.FINN, 1, Area.Treehouse));
        addLevel(new Level(4, 1, Hero.BMO, 2, Area.Treehouse));
        addLevel(new Level(5, 1, Hero.BMO, 2, Area.Treehouse));
        addLevel(new Level(6, 1, Hero.BMO, 2, Area.Treehouse)
                    .addQuest(3, Quest.RAINBOW_ONLY));
        addLevel(new Level(7, 1, Hero.MARCELINE, 3, Area.Treehouse));
        addLevel(new Level(8, 1, Hero.MARCELINE, 3, Area.Treehouse));
        addLevel(new Level(9, 1, Hero.MARCELINE, 3, Area.Treehouse)
                    .addQuest(2, Quest.SWAMP_ONLY));
        addLevel(new Level(10, 1, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse));
        addLevel(new Level(11, 1, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse));
        addLevel(new Level(12, 2, Hero.PRINCESS_BUBBLEGUM, 4, Area.Treehouse)
                    .addQuest(3, Quest.LANDSCAPES_FOUR_DIFFERENT));
        addLevel(new Level(13, 1, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                    .addQuest(2, Quest.PLAINS_ONLY));
        addLevel(new Level(14, 1, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                    .addQuest(2, Quest.NICE_ONLY));
        addLevel(new Level(15, 2, Hero.FLAME_PRINCESS, 5, Area.Treehouse)
                    .addQuest(2, Quest.SWAMP_ONLY));
        
        addLevel(new Level(16, 1, Hero.LADY_RAINICORN, 6, Area.Forest)
                    .addQuest(3, Quest.LOSE_5HP_MAX));
        addLevel(new Level(17, 1, Hero.LADY_RAINICORN, 6, Area.Forest)
                    .addQuest(2, Quest.PLAINS_ONLY));
        addLevel(new Level(18, 2, Hero.LADY_RAINICORN, 6, Area.Forest)
                    .addQuest(2, Quest.RAINBOW_ONLY));
        addLevel(new Level(19, 2, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                    .addQuest(2, Quest.NO_BUILDINGS));
        addLevel(new Level(20, 2, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                    .addQuest(2, Quest.LANDSCAPES_THREE_DIFFERENT));
        addLevel(new Level(21, 3, Hero.LUMPY_SPACE_PRINCESS, 7, Area.Forest)
                    .addQuest(2, Quest.NO_SPELLS));
        addLevel(new Level(22, 2, Hero.ASH, 8, Area.Forest));
    }
}
