package com.kevinquan.cwa.model.creatures.nice;

public class FatGoat extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = FatGoat.class.getSimpleName();
    
    public FatGoat() {
        super("Fat Goat", 2, Rarity.Nice);
        mDescription = "Heal adjacent creature 4 points"; // Check
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 14; }
    @Override public int getFloopCost() { return 2; }

}
