package com.kevinquan.cwa.model.creatures.plains;

public class Poultrygeist extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Poultrygeist.class.getSimpleName();
    
    public Poultrygeist() {
        super(Poultrygeist.class.getSimpleName(), 1, Rarity.Cool);
        mDescription = "Gain +2 Magic Points next turn";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 1; }

}
