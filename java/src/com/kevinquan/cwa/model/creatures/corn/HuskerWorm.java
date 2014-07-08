package com.kevinquan.cwa.model.creatures.corn;

public class HuskerWorm extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = HuskerWorm.class.getSimpleName();
    
    public HuskerWorm() {
        super("Husker Worm", 1, Rarity.Cool);
        mDescription = "Lower the Attack of the creature in the opposing lane by 2";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 2; }

}
