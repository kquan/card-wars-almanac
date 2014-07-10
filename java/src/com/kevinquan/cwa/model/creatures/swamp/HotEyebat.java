package com.kevinquan.cwa.model.creatures.swamp;

public class HotEyebat extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = HotEyebat.class.getSimpleName();
    
    public HotEyebat() {
        super("Hot Eyebat", 2, Rarity.Nice);
        mDescription = "Deal 4 Damage to any opposing creature";
    }

    @Override public int getInitialAttack() { return 8; }
    @Override public int getInitialDefense() { return 9; }
    @Override public int getFloopCost() { return 2; }

}
