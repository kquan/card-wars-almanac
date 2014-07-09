package com.kevinquan.cwa.model.spells;

public class CornScepter extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = CornScepter.class.getSimpleName();
    
    public CornScepter() {
        super("Corn Scepter", 2, Rarity.Nice);
        mDescription = "Choose a Corn creature and attack the opposing creature in its lane";
    }

}
