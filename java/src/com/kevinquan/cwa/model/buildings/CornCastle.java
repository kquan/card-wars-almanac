package com.kevinquan.cwa.model.buildings;

public class CornCastle extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = CornCastle.class.getSimpleName();
    
    public CornCastle() {
        super("Corn Castle", 1, Rarity.Nice);
        mDescription = "Creature in this lane gets +2 Attack for each of your creatures on the field"; // Check
    }

}
