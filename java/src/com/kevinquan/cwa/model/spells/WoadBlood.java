package com.kevinquan.cwa.model.spells;

public class WoadBlood extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = WoadBlood.class.getSimpleName();
    
    public WoadBlood() {
        super("Woad Blood", 3, Rarity.Cool);
        mDescription = "Choose one of your creatures and heal all damage";
    }

}
