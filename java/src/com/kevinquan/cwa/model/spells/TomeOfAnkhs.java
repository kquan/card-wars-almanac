package com.kevinquan.cwa.model.spells;

public class TomeOfAnkhs extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = TomeOfAnkhs.class.getSimpleName();
    
    public TomeOfAnkhs() {
        super("Tome of Ankhs", 2, Rarity.Nice);
        mDescription = "Choose a Sandy Lands creature and attack the opposing creature in its lane";
    }

}
