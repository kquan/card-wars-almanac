package com.kevinquan.cwa.model.spells;

public class SnakeEyeRing extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = SnakeEyeRing.class.getSimpleName();
    
    public SnakeEyeRing() {
        super("Snake Eye Ring", 3, Rarity.VeryRare);
        mDescription = "Draw 1 card for each of your empty lanes"; // Check
    }

}
