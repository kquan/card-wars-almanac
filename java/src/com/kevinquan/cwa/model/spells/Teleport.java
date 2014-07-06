package com.kevinquan.cwa.model.spells;

public class Teleport extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = Teleport.class.getSimpleName();
    
    public Teleport() {
        super(Teleport.class.getSimpleName(), 1, Rarity.Cool);
        mDescription = "Choose one of your creatures and return it to your hand";
    }

}
