package com.kevinquan.cwa.model.spells;

public class FallingStar extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = FallingStar.class.getSimpleName();
    
    public FallingStar() {
        super("Falling Star", 1, Rarity.Rare);
        mDescription = "Opponent gets 2 less Magic Points next turn"; // Check
    }

}
