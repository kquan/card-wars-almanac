package com.kevinquan.cwa.model.creatures.sandy;

public class MsMummy extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = MsMummy.class.getSimpleName();
    
    public MsMummy() {
        super("Ms. Mummy", 1, Rarity.Cool);
        mDescription = "Adjacent creature gain +3 Defense";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 3; }

}
