package com.kevinquan.cwa.model.levels;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;


public class LootDropStore {
    
    public static class LootDropDetails {
        
        protected Level mLevel;
        protected Card mCard;
        protected float mPercentage;
        
        public LootDropDetails(Card card, Level level, float percentage) {
            mCard = card;
            mLevel = level;
            mPercentage = percentage;
        }

        public Level getLevel() {
            return mLevel;
        }

        public Card getCard() {
            return mCard;
        }

        public float getPercentage() {
            return mPercentage;
        }
    }

    @SuppressWarnings("unused")
    private static final String TAG = LootDropStore.class.getSimpleName();
    
    private static class LootDropStoreHolder {
        private static final LootDropStore INSTANCE = new LootDropStore();
    }
    
    public static LootDropStore getInstance() {
        return LootDropStoreHolder.INSTANCE;
    }
    
    protected Hashtable<String, List<LootDropDetails>> mCardIndex;
    protected Hashtable<Integer, List<LootDropDetails>> mLevelIndex;
    
    private LootDropStore() {
        mCardIndex = new Hashtable<String, List<LootDropDetails>>();
        mLevelIndex = new Hashtable<Integer, List<LootDropDetails>>();
        init();
    }
    
    protected void addDropDetails(LootDropDetails details) {
        Card card = details.getCard();
        if (!mCardIndex.containsKey(card.getId())) {
            List<LootDropDetails> drops = new ArrayList<LootDropDetails>();
            mCardIndex.put(card.getId(), drops);
        }
        mCardIndex.get(card.getId()).add(details);
        int levelNumber = details.getLevel().getLevelNumber();
        if (!mLevelIndex.containsKey(levelNumber)) {
            List<LootDropDetails> drops = new ArrayList<LootDropDetails>();
            mLevelIndex.put(levelNumber, drops);
        }
        mLevelIndex.get(levelNumber).add(details);
    }
    
    protected void init() {
        LevelStore levelStore = LevelStore.getInstance();
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(1), 1));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(2), 1));
    }

}
