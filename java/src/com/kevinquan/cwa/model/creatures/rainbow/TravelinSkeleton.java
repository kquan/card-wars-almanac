package com.kevinquan.cwa.model.creatures.rainbow;

public class TravelinSkeleton extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TravelinSkeleton.class.getSimpleName();
    
    public TravelinSkeleton() {
        super("Travelin' Skeleton", 1, Rarity.Cool);
        mDescription = "Deal 4 Damage to a random creature, including your own";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 1; }

}
