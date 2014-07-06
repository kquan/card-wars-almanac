package com.kevinquan.cwa.model.spells;

public class WizardMigrane extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = WizardMigrane.class.getSimpleName();
    
    public WizardMigrane() {
        super("Wizard Migrane", 1, Rarity.Cool);
        mDescription = "Discard your hand and gain 4 Magic Points";
    }

}
