package com.kevinquan.cwa.model.creatures.sandy;

public class BeachMum extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = BeachMum.class.getSimpleName();
    
    public BeachMum() {
        super("Beach Mum", 2, Rarity.Nice);
        mDescription = "Gain +2 Atack and +3 Defense";
    }

    @Override public int getInitialAttack() { return 9; }
    @Override public int getInitialDefense() { return 11; }
    @Override public int getFloopCost() { return 3; }

}
