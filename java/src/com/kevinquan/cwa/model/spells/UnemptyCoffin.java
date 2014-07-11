package com.kevinquan.cwa.model.spells;

public class UnemptyCoffin extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = UnemptyCoffin.class.getSimpleName();
    
    public UnemptyCoffin() {
        super("Unempty Coffin", 2, Rarity.VeryRare);
        mDescription = "Return any creature from the Discard Pile to your hand"; // Check
    }

}
