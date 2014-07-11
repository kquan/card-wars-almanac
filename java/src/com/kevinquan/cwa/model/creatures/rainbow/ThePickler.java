package com.kevinquan.cwa.model.creatures.rainbow;

public class ThePickler extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = ThePickler.class.getSimpleName();
    
    public ThePickler() {
        super("The Pickler", 4, Rarity.VeryRare);
        mDescription = "Lower the Defense of all opposing creatures by 5";
    }

    @Override public int getInitialAttack() { return 12; }
    @Override public int getInitialDefense() { return 8; }
    @Override public int getFloopCost() { return 3; }

}
