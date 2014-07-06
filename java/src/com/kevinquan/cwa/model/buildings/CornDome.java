package com.kevinquan.cwa.model.buildings;

public class CornDome extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = CornDome.class.getSimpleName();
    
    public CornDome() {
        super("Corn Dome", 1, Rarity.Cool);
        mDescription = "Creature in this lane gets +3 Attack";
    }

}
