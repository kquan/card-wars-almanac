package com.kevinquan.cwa.model.spells;

public class CrystalBall extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = CrystalBall.class.getSimpleName();
    
    public CrystalBall() {
        super("Crystal Ball", 2, Rarity.Cool);
        mDescription = "Shuffle your hand back into your Deck and draw 5 new cards";
    }

}
