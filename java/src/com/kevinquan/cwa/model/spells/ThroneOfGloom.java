package com.kevinquan.cwa.model.spells;

public class ThroneOfGloom extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ThroneOfGloom.class.getSimpleName();
    
    public ThroneOfGloom() {
        super("Throne of Gloom", 1, Rarity.VeryRare);
        mDescription = "Destroy any of your Buildings and gain 4 Magic Points"; // Check
    }

}
