package com.kevinquan.cwa.model.spells;

public class FountainOfForgiveness extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = FountainOfForgiveness.class.getSimpleName();
    
    public FountainOfForgiveness() {
        super("Fountain of Forgiveness", 2, Rarity.Nice);
        mDescription = "Choose one of your damaged creatures and heal it equal to its own Attack";
    }

}
