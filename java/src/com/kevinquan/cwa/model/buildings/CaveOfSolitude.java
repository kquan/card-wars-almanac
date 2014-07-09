package com.kevinquan.cwa.model.buildings;

public class CaveOfSolitude extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = CaveOfSolitude.class.getSimpleName();
    
    public CaveOfSolitude() {
        super("Cave of Solitude", 1, Rarity.VeryRare);
        mDescription = "Creature in this lane gets +2 Attack and +2 Defense for each of your empty lanes"; // Check
    }

}
