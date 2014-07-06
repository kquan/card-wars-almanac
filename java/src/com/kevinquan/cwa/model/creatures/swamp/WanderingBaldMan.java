package com.kevinquan.cwa.model.creatures.swamp;

public class WanderingBaldMan extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = WanderingBaldMan.class.getSimpleName();
    
    public WanderingBaldMan() {
        super("Wandering Bald Man", 1, Rarity.Cool);
        mDescription = "Deal 2 Damage to creature in the opposing lane";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 2; }

}
