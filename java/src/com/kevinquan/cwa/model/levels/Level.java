package com.kevinquan.cwa.model.levels;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.kevinquan.cwa.model.hero.Hero;

public class Level {
    
    public enum Area {
        Treehouse("Finn and Jake's Treehouse"),
        Forest("The Forest"),
        CandyKingdom("Candy Kingdom"),
        Beach("Beach"),
        MarcelineCave("Marceline's Cave"),
        IceKingdom("Ice Kingdom"),
        Desert("Desert"),
        DarkForest("Dark Forest"),
        ;
        
        protected String mName;
        
        private Area(String name) {
            mName = name;
        }

        public String getName() {
            return mName;
        }
        
    }

    @SuppressWarnings("unused")
    private static final String TAG = Level.class.getSimpleName();
    
    protected static final int MAXIMUM_NUMBER_OF_QUESTS = 3;
    public static final int MAXIMUM_LEVEL = 120;
    
    protected int mLevelNumber;
    protected int mCost;
    protected Hero mOpponent;
    protected int mOpponentLevel;
    protected Area mArea;
    protected Hashtable<Integer, Quest> mQuests;
    
    public Level(int number, int cost, Hero opponent, int opponentLevel, Area area) {
        mLevelNumber = number;
        mCost = cost;
        mOpponent = opponent;
        mOpponentLevel = opponentLevel;
        mArea = area;
        mQuests = new Hashtable<Integer, Quest>(3);
        mQuests.put(1, Quest.DEFAULT_FIRST_QUEST);
    }

    public int getLevelNumber() {
        return mLevelNumber;
    }

    public Hero getOpponent() {
        return mOpponent;
    }

    public List<Quest> getQuests() {
        List<Quest> orderedQuests = new ArrayList<Quest>();
        if (mQuests.containsKey(1)) {
            orderedQuests.add(mQuests.get(1));
        }
        if (mQuests.containsKey(2)) {
            orderedQuests.add(mQuests.get(2));
        }
        if (mQuests.containsKey(3)) {
            orderedQuests.add(mQuests.get(3));
        }
        return orderedQuests;
    }
    
    public Quest getQuest(int questNumber) {
        if (questNumber <= 0 || questNumber > MAXIMUM_NUMBER_OF_QUESTS) {
            return null;
        }
        return mQuests.get(questNumber);
    }
    
    public Level addQuest(int questNumber, Quest quest) {
        if (questNumber == 0) {
            throw new RuntimeException("Quest number must start at 1");
        }
        if (quest == null || questNumber > MAXIMUM_NUMBER_OF_QUESTS) {
            return this;
        }
        mQuests.put(questNumber, quest);
        return this;
    }

    public Area getArea() {
        return mArea;
    }

    public int getCost() {
        return mCost;
    }

    public int getOpponentLevel() {
        return mOpponentLevel;
    }

}
