package com.kevinquan.cwa.model.buildings;

public class PalaceOfBone extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = PalaceOfBone.class.getSimpleName();
    
    public PalaceOfBone() {
        super("Palace of Bone", 1, Rarity.Rare);
        mDescription = "Deal 2 Damage to the opposing creature when a new creature is placed on this lane";
    }

}
