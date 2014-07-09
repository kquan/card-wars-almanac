package com.kevinquan.cwa.model.buildings;

public class CornParthenon extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = CornParthenon.class.getSimpleName();
    
    public CornParthenon() {
        super("Corn Parthenon", 1, Rarity.VeryRare);
        mDescription = "Creature in this lane gets +1 Attack for each different landscape on the field"; // Check
    }

}
