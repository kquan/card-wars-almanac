package com.kevinquan.cwa.model.creatures.sandy;

public class SandEyebat extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = SandEyebat.class.getSimpleName();
    
    public SandEyebat() {
        super("Sand Eyebat", 1, Rarity.Cool);
        mDescription = "Choose an opposing creature and lower its Defense by 2";
    }

    @Override public int getInitialAttack() { return 4; }
    @Override public int getInitialDefense() { return 4; }
    @Override public int getFloopCost() { return 1; }

}
