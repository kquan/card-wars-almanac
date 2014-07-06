package com.kevinquan.cwa.model.creatures.rainbow;

public class ThePig extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = ThePig.class.getSimpleName();
    
    public ThePig() {
        super("The Pig", 1, Rarity.Cool);
        mDescription = "Decrease the Attack of all Corn creatures by 1";
    }

    @Override public int getInitialAttack() { return 1; }
    @Override public int getInitialDefense() { return 4; }
    @Override public int getFloopCost() { return 3; }

}
