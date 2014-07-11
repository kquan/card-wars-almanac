package com.kevinquan.cwa.model.spells;

public class WizardRawk extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = WizardRawk.class.getSimpleName();
    
    public WizardRawk() {
        super("WizardRawk", 3, Rarity.VeryRare);
        mDescription = "Choose one of your creatures and give it Attack equal to how much Damage it has taken"; // Check
    }

}
