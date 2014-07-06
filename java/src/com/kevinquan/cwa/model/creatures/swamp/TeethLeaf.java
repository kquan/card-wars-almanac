package com.kevinquan.cwa.model.creatures.swamp;

public class TeethLeaf extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TeethLeaf.class.getSimpleName();
    
    public TeethLeaf() {
        super("Teeth Leaf", 1, Rarity.Cool);
        mDescription = "Deal 2 Damage to the opposing Hero";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 2; }

}
