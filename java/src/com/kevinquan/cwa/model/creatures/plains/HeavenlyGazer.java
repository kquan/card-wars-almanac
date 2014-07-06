package com.kevinquan.cwa.model.creatures.plains;

public class HeavenlyGazer extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = HeavenlyGazer.class.getSimpleName();
    
    public HeavenlyGazer() {
        super("Heavenly Gazer", 1, Rarity.Cool);
        mDescription = "Draw 1 card";
    }

    @Override public int getInitialAttack() { return 1; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 2; }

}
