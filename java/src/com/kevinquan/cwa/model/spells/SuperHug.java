package com.kevinquan.cwa.model.spells;

public class SuperHug extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = SuperHug.class.getSimpleName();
    
    public SuperHug() {
        super("Super Hug", 2, Rarity.Nice);
        mDescription = "Choose a Nice Lands creature and attack the opposing creature in its lane";
    }

}
