package com.kevinquan.cwa.model.creatures.sandy;

public class LimeSlimey extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = LimeSlimey.class.getSimpleName();
    
    public LimeSlimey() {
        super("Lime Slimey", 2, Rarity.Nice);
        mDescription = "This creature and adjacent creatures gain +3 Defense";
    }

    @Override public int getInitialAttack() { return 8; }
    @Override public int getInitialDefense() { return 8; }
    @Override public int getFloopCost() { return 3; }

}
