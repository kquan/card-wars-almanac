package com.kevinquan.cwa.model.buildings;

public class SandCastle extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = SandCastle.class.getSimpleName();
    
    public SandCastle() {
        super("Sand Castle", 1, Rarity.Cool);
        mDescription = "Creature in this lane gets +4 Attack and +4 Defense";
    }

}
