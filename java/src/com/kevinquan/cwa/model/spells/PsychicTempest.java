package com.kevinquan.cwa.model.spells;

public class PsychicTempest extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = PsychicTempest.class.getSimpleName();
    
    public PsychicTempest() {
        super("Psychic Tempest", 1, Rarity.Nice);
        mDescription = "Opponent cannot cast Spells next turn";
    }

}
