package com.kevinquan.cwa.model.creatures.nice;

public class AngelHeart extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = AngelHeart.class.getSimpleName();
    
    public AngelHeart() {
        super("Angel Heart", 1, Rarity.Cool);
        mDescription = "Choose one of your creatures and heal it 3 points";
    }

    @Override public int getInitialAttack() { return 1; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 1; }

}
