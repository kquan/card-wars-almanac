package com.kevinquan.cwa.model.spells;

public class ZaZosMagicSeeds extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ZaZosMagicSeeds.class.getSimpleName();
    
    public ZaZosMagicSeeds() {
        super("ZaZo's Magic Seeds", 1, Rarity.AlgebraicRare);
        mDescription = "Gain 1 Magic Point for each of your creatures on the field"; // Check
    }

}
