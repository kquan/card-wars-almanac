package com.kevinquan.cwa.model.spells;

public class ClairvoyantDaggerstorm extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ClairvoyantDaggerstorm.class.getSimpleName();
    
    public ClairvoyantDaggerstorm() {
        super("Clairvoyant Daggerstorm", 3, Rarity.Rare);
        mDescription = "Choose an opposing creature and double the amount of Damage on it"; // Check
    }

}
