package com.kevinquan.cwa.model.creatures.nice;

public class NicelandsEyeBat extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = NicelandsEyeBat.class.getSimpleName();
    
    public NicelandsEyeBat() {
        super("Nicelands Eye Bat", 2, Rarity.Nice);
        mDescription = "Choose one of your creatures and heal it 4 points for each card in your hand";
    }

    @Override public int getInitialAttack() { return 7; }
    @Override public int getInitialDefense() { return 10; }
    @Override public int getFloopCost() { return 3; }

}
