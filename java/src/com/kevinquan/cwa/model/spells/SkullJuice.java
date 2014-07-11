package com.kevinquan.cwa.model.spells;

public class SkullJuice extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = SkullJuice.class.getSimpleName();
    
    public SkullJuice() {
        super("Skull Juice", 3, Rarity.AlgebraicRare);
        mDescription = "Choose on of your opponent's creatures and switch its Attack and Defense values"; // Check
    }

}
