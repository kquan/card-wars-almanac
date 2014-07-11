package com.kevinquan.cwa.model.spells;

public class PortalToNowhere extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = PortalToNowhere.class.getSimpleName();
    
    public PortalToNowhere() {
        super("Portal to Nowhere", 1, Rarity.VeryRare);
        mDescription = "Return all of your creatures on the field to your hand"; // Check
    }

}
