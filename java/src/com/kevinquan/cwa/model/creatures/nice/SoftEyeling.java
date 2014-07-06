package com.kevinquan.cwa.model.creatures.nice;

public class SoftEyeling extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = SoftEyeling.class.getSimpleName();
    
    public SoftEyeling() {
        super("Soft Eyeling", 1, Rarity.Cool);
        mDescription = "Choose a creature and heal 3 points for each of your different landscapes";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 3; }

}
