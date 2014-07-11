package com.kevinquan.cwa.model.spells;

public class CoughSyrup extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = CoughSyrup.class.getSimpleName();
    
    public CoughSyrup() {
        super("Cough Syrup", 2, Rarity.Rare);
        mDescription = "Choose one of your creatures and switch its Attack and Defense values"; // Check
    }

}
