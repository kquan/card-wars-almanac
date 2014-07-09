package com.kevinquan.cwa.model.buildings;

public class NicelandsTower extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = NicelandsTower.class.getSimpleName();
    
    public NicelandsTower() {
        super("Nicelands Tower", 1, Rarity.VeryRare);
        mDescription = "Creature in this lane heals 3 Damage at the start of your turn"; // Check
    }

}
