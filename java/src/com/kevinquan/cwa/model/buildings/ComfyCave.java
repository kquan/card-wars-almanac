package com.kevinquan.cwa.model.buildings;

public class ComfyCave extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = ComfyCave.class.getSimpleName();
    
    public ComfyCave() {
        super("Comfy Cave", 1, Rarity.ThreeStars);
        mDescription = "Creature in this lane heals 2 Damage for each creature you control at start of turn";
    }

}
