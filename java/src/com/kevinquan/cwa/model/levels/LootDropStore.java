package com.kevinquan.cwa.model.levels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.FatGoat;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.SoftEyeling;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;
import com.kevinquan.cwa.model.spells.BoneWand;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.CrystalBall;
import com.kevinquan.cwa.model.spells.FountainOfForgiveness;
import com.kevinquan.cwa.model.spells.StrawberryButt;
import com.kevinquan.cwa.model.spells.TomeOfAnkhs;
import com.kevinquan.cwa.model.spells.Volcano;
import com.kevinquan.cwa.model.spells.WizardMigrane;
import com.kevinquan.cwa.model.spells.WoadBlood;


public class LootDropStore {
    
    public static class LootDropPriorityComparator implements Comparator<LootDropDetails> {

        @Override
        public int compare(LootDropDetails arg0, LootDropDetails arg1) {
            // Static weight
            if (arg0.getStaticWeight() != arg1.getStaticWeight()) {
                // Higher first
                return arg0.getStaticWeight() - arg1.getStaticWeight() > 0 ? -1 : 1;
            }
            Card lhs = arg0.getCard();
            Card rhs = arg1.getCard();
            // Rarity
            if (lhs.getRarity().getStars() != rhs.getRarity().getStars()) {
                // Rarer first
                return lhs.getRarity().getStars() - rhs.getRarity().getStars() > 0 ? -1 : 1;
            }
            // Alphabetical
            return lhs.getName().compareToIgnoreCase(rhs.getName());
        }
        
    }
    
    public static class LootDropDetails {
        
        protected Level mLevel;
        protected Card mCard;
        protected double mDropChance;
        protected double mStaticWeight;
        
        public LootDropDetails(Card card, Level level, double chance, double weight) {
            mCard = card;
            mLevel = level;
            mDropChance = chance;
            mStaticWeight = weight;
        }

        public Level getLevel() {
            return mLevel;
        }

        public Card getCard() {
            return mCard;
        }
        
        public double getDropChance() {
            return mDropChance;
        }

        public double getStaticWeight() {
            return mStaticWeight;
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
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(1), 0.0, 100.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(2), 0.0, 100.0));
        addDropDetails(new LootDropDetails(new CoolDog(), levelStore.getLevel(3), 1.0, 100.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(3), 1.0, 100.0));
        addDropDetails(new LootDropDetails(new ThePig(), levelStore.getLevel(3), 1.0, 100.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Cornball(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new GrapeSlimey(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Mouthball(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(4), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CrystalBall(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new EthanAllfire(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new ThePig(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(5), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Cornball(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new EthanAllfire(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new GrapeSlimey(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Mouthball(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new ThePig(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(6), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WanderingBaldMan(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(7), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WanderingBaldMan(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(8), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(9), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(9), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(9), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WanderingBaldMan(), levelStore.getLevel(9), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(9), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Fluffapillar(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(10), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Fluffapillar(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(11), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Fluffapillar(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(12), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new BurningHand(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CrystalBall(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new GreenCactaball(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(13), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new BurningHand(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CrystalBall(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new GreenCactaball(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(14), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new BurningHand(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new CrystalBall(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new GreenCactaball(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(15), 0.5, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(16), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(16), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(16), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(16), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new GreenCactaball(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(17), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new AngelHeart(), levelStore.getLevel(18), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(18), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new SoftEyeling(), levelStore.getLevel(18), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(18), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(18), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new FatGoat(), levelStore.getLevel(18), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CoolDog(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new TeethLeaf(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(19), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CoolDog(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(20), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CoolDog(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new HeavenlyGazer(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new Volcano(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WizardMigrane(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(21), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(22), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new MsMummy(), levelStore.getLevel(22), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(22), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new TeethLeaf(), levelStore.getLevel(22), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(22), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new BoneWand(), levelStore.getLevel(22), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new FountainOfForgiveness(), levelStore.getLevel(22), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(23), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(23), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new TeethLeaf(), levelStore.getLevel(23), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(23), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new BoneWand(), levelStore.getLevel(23), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new FountainOfForgiveness(), levelStore.getLevel(23), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new CornDome(), levelStore.getLevel(24), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new OrangeSlimey(), levelStore.getLevel(24), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new TeethLeaf(), levelStore.getLevel(24), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(24), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new BoneWand(), levelStore.getLevel(24), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new FountainOfForgiveness(), levelStore.getLevel(24), 0.37, 400.0));
        addDropDetails(new LootDropDetails(new CerebralBloodstorm(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new EthanAllfire(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new GreenCactaball(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new MsMummy(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new StrawberryButt(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new WoadBlood(), levelStore.getLevel(25), 0.37, 500.0));
        addDropDetails(new LootDropDetails(new TomeOfAnkhs(), levelStore.getLevel(25), 0.37, 400.0));
    }

}
