package com.kevinquan.cwa.model.spells;

public class BananaButt extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = BananaButt.class.getSimpleName();
    
    public BananaButt() {
        super("Banana Butt", 1, Rarity.VeryRare);
        mDescription = "Destroy one of your Creatures and draw 1 card"; // Check
    }

}
