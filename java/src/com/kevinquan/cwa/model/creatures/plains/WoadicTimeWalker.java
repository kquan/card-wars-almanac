package com.kevinquan.cwa.model.creatures.plains;

public class WoadicTimeWalker extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = WoadicTimeWalker.class.getSimpleName();
    
    public WoadicTimeWalker() {
        super("Woadic Time Walker", 1, Rarity.Cool);
        mDescription = "Damage done to opposing creature next Battle Phase is transferred to Hero";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 1; }

}
