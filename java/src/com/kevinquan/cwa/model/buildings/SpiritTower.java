package com.kevinquan.cwa.model.buildings;

public class SpiritTower extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SpiritTower.class.getSimpleName();
    
    public SpiritTower() {
        super("Spirit Tower", 1, Rarity.AlgebraicRare);
        mDescription = "Deal 3 Damage to the opposing hero when a new creature is placed in this lane"; // Check
    }

}
