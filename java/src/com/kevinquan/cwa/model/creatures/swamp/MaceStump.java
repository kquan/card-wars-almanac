package com.kevinquan.cwa.model.creatures.swamp;

public class MaceStump extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = MaceStump.class.getSimpleName();
    
    public MaceStump() {
        super("Mace Stump", 1, Rarity.Cool);
        mDescription = "Deal 3 Damage to creature in the opposing lane";
    }

    @Override public int getInitialAttack() { return 6; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 3; }

}
