package com.kevinquan.cwa.model.spells;

public class SpiritTorch extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = SpiritTorch.class.getSimpleName();
    
    public SpiritTorch() {
        super("Spirit Torch", 3, Rarity.VeryRare);
        mDescription = "Choose an opposing lane.  No building or creature may be summoned on this lane next turn"; // Check
    }

}
