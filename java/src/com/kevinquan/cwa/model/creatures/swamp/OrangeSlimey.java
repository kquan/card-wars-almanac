package com.kevinquan.cwa.model.creatures.swamp;

public class OrangeSlimey extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = OrangeSlimey.class.getSimpleName();
    
    public OrangeSlimey() {
        super("Orange Slimey", 1, Rarity.Cool);
        mDescription = "Deal 4 Damage to creature in the opposing lane and Discard this creature";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 4; }
    @Override public int getFloopCost() { return 1; }

}
