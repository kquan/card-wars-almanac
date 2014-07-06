package com.kevinquan.cwa.model.creatures.sandy;

public class GreenCactaball extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = GreenCactaball.class.getSimpleName();
    
    public GreenCactaball() {
        super("Green Cactaball", 1, Rarity.Cool);
        mDescription = "Gain +2 Defense";
    }

    @Override public int getInitialAttack() { return 4; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 1; }

}
