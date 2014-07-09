package com.kevinquan.cwa.model.buildings;

public class SandPyramid extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SandPyramid.class.getSimpleName();
    
    public SandPyramid() {
        super("Sand Pyramid", 1, Rarity.Rare);
        mDescription = "Creature in this lane heals 5 Damage when it destroys a creature"; // Check
    }

}
