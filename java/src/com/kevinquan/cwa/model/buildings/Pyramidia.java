package com.kevinquan.cwa.model.buildings;

public class Pyramidia extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = Pyramidia.class.getSimpleName();
    
    public Pyramidia() {
        super(Pyramidia.class.getSimpleName(), 1, Rarity.Nice);
        mDescription = "Creature in this lane gets +1 Defense for each card in your hand"; // Check
    }

}
