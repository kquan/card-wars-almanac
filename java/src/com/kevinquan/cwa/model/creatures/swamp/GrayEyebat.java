package com.kevinquan.cwa.model.creatures.swamp;

public class GrayEyebat extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = GrayEyebat.class.getSimpleName();
    
    public GrayEyebat() {
        super("Gray Eyebat", 1, Rarity.Cool);
        mDescription = "Deal 2 Damage to any opposing creature";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 2; }

}
