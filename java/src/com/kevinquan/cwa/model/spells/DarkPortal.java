package com.kevinquan.cwa.model.spells;

public class DarkPortal extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = DarkPortal.class.getSimpleName();
    
    public DarkPortal() {
        super("Dark Portal", 2, Rarity.Rare);
        mDescription = "Choose an opposing Building and move it to an empty lane"; // Check
    }

}
