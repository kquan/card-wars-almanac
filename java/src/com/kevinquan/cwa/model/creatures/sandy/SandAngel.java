package com.kevinquan.cwa.model.creatures.sandy;

public class SandAngel extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = SandAngel.class.getSimpleName();
    
    public SandAngel() {
        super("Sand Angel", 1, Rarity.Cool);
        mDescription = "Choose one of your creatures and give it +2 Defense";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 1; }

}
