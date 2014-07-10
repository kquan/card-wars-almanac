package com.kevinquan.cwa.model.creatures.plains;

public class Axey extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Axey.class.getSimpleName();
    
    public Axey() {
        super(Axey.class.getSimpleName(), 2, Rarity.Nice);
        mDescription = "Send Building in opposing lane back to opponent's hand";
    }

    @Override public int getInitialAttack() { return 13; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 1; }

}
