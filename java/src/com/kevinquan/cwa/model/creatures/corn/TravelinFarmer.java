package com.kevinquan.cwa.model.creatures.corn;

public class TravelinFarmer extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TravelinFarmer.class.getSimpleName();
    
    public TravelinFarmer() {
        super("Travelin' Farmer", 1, Rarity.Cool);
        mDescription = "Gain +1 Attack for each adjacent empty lane";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 1; }

}
