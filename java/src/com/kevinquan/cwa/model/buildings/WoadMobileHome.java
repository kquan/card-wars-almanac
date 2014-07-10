package com.kevinquan.cwa.model.buildings;

public class WoadMobileHome extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = WoadMobileHome.class.getSimpleName();
    
    public WoadMobileHome() {
        super("Woad Mobile Home", 1, Rarity.Nice);
        mDescription = "Creature in this lane gets +3 Defense for each of your creatures on the field";
    }

}
