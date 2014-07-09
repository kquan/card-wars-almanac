package com.kevinquan.cwa.model.spells;

public class ScrollOfFreshBreath extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ScrollOfFreshBreath.class.getSimpleName();
    
    public ScrollOfFreshBreath() {
        super("Scroll of Fresh Breath", 1, Rarity.Nice);
        mDescription = "Return a Building card from the Discard Pile to your hand"; // Check
    }

}
