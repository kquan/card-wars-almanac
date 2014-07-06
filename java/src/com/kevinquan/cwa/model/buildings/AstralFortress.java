package com.kevinquan.cwa.model.buildings;

public class AstralFortress extends AbstractBuildingCard {

    @SuppressWarnings("unused")
    private static final String TAG = AstralFortress.class.getSimpleName();
    
    public AstralFortress() {
        super("Astral Fortress", 1, Rarity.Cool);
        mDescription = "Creature in this lane gets +4 Defense";
    }

}
