package com.kevinquan.cwa.model.spells;

public class WitchWay extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = WitchWay.class.getSimpleName();
    
    public WitchWay() {
        super("Witch Way", 1, Rarity.Rare);
        mDescription = "Gain 1 Magic Point for every different landscape on the field"; // Check
    }

}
