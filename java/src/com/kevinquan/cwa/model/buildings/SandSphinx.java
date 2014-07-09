package com.kevinquan.cwa.model.buildings;

public class SandSphinx extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SandSphinx.class.getSimpleName();
    
    public SandSphinx() {
        super("Sand Sphinx", 1, Rarity.VeryRare);
        mDescription = "Creature in this lane takes 5 less Damage when attacked"; // Check
    }

}
