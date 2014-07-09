package com.kevinquan.cwa.model.buildings;

public class SiloOfTruth extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SiloOfTruth.class.getSimpleName();
    
    public SiloOfTruth() {
        super("Silo of Truth", 1, Rarity.Rare);
        mDescription = "Creature in this lane gets +1 Attack for each card in your opponents hand"; // Check
    }

}
