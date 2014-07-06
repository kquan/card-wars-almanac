package com.kevinquan.cwa.model.spells;

public class UfoAbduction extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = UfoAbduction.class.getSimpleName();
    
    public UfoAbduction() {
        super("UFO Abduction", 1, Rarity.Cool);
        mDescription = "Choose one of your Buildings and move it to one of your empty lanes";
    }

}
