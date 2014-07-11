package com.kevinquan.cwa.model.spells;

public class FieldOfNightmares extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = FieldOfNightmares.class.getSimpleName();
    
    public FieldOfNightmares() {
        super("Field of Nightmares", 1, Rarity.Rare);
        mDescription = "Choose an opposing creature.  It cannot use its floop ability next turn"; // Check
    }

}
