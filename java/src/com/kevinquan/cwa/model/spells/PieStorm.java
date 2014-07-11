package com.kevinquan.cwa.model.spells;

public class PieStorm extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = PieStorm.class.getSimpleName();
    
    public PieStorm() {
        super("Pie Storm", 3, Rarity.VeryRare);
        mDescription = "Heal all creatures on the field (including your opponent's)"; // Check
    }

}
