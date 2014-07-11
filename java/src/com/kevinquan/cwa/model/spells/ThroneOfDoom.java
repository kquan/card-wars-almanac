package com.kevinquan.cwa.model.spells;

public class ThroneOfDoom extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ThroneOfDoom.class.getSimpleName();
    
    public ThroneOfDoom() {
        super("Throne of Doom", 1, Rarity.VeryRare);
        mDescription = "Destroy any of your creatures and gain 4 Magic Points"; // Check
    }

}
