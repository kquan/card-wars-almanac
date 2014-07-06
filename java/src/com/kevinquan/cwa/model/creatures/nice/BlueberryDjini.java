package com.kevinquan.cwa.model.creatures.nice;

public class BlueberryDjini extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = BlueberryDjini.class.getSimpleName();
    
    public BlueberryDjini() {
        super("Blueberry Djini", 1, Rarity.Cool);
        mDescription = "Heal your Hero 2 points";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 7; }
    @Override public int getFloopCost() { return 2; }

}
