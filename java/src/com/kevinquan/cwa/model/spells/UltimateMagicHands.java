package com.kevinquan.cwa.model.spells;

public class UltimateMagicHands extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = UltimateMagicHands.class.getSimpleName();
    
    public UltimateMagicHands() {
        super("Ultimate Magic Hands", 3, Rarity.AlgebraicRare);
        mDescription = "Choose an opposing creature and send it back to your opponent's hand"; // Check
    }

}
