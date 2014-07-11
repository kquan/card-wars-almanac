package com.kevinquan.cwa.model.spells;

public class ScrollOfBadBreath extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ScrollOfBadBreath.class.getSimpleName();
    
    public ScrollOfBadBreath() {
        super("Scroll of Bad Breath", 1, Rarity.AlgebraicRare);
        mDescription = "Return a Spell card from your Discard Pile to your hand"; // Check
    }

}
