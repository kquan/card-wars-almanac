package com.kevinquan.cwa.model.creatures.nice;

public class FairyShepard extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = FairyShepard.class.getSimpleName();
    
    public FairyShepard() {
        super("Fairy Shepard", 1, Rarity.Cool);
        mDescription = "Choose one of your creatures.  Heal it and its adjacent creatures 3 points";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 7; }
    @Override public int getFloopCost() { return 3; }

}
