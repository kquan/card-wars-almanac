package com.kevinquan.cwa.model.buildings;

public class SchoolHouse extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SchoolHouse.class.getSimpleName();
    
    public SchoolHouse() {
        super("School House", 1, Rarity.AlgebraicRare);
        mDescription = "Your creature in this lane gains 3 Defense when a Floop ability is used"; // Check
    }

}
