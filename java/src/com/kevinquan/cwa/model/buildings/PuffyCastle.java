package com.kevinquan.cwa.model.buildings;

public class PuffyCastle extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = PuffyCastle.class.getSimpleName();
    
    public PuffyCastle() {
        super("Puffy Castle", 1, Rarity.AlgebraicRare);
        mDescription = "Heal 2 Damage from your Hero when a creature in this lane is destryoed"; // Check
    }

}
