package com.kevinquan.cwa.model.spells;

public class GrapeButt extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = GrapeButt.class.getSimpleName();
    
    public GrapeButt() {
        super("Grape Butt", 1, Rarity.Nice);
        mDescription = "Destroy one of your buildings and draw 1 card";
    }

}
