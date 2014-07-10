package com.kevinquan.cwa.model.creatures.sandy;

public class MayonaiseAngel extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = MayonaiseAngel.class.getSimpleName();
    
    public MayonaiseAngel() {
        super("Mayonaise Angel", 2, Rarity.Nice);
        mDescription = "Choose one of your creatures and give it +4 Defense";
    }

    @Override public int getInitialAttack() { return 4; }
    @Override public int getInitialDefense() { return 12; }
    @Override public int getFloopCost() { return 2; }

}
