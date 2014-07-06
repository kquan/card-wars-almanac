package com.kevinquan.cwa.model.creatures.nice;

public class GoldSoftEyeling extends SoftEyeling {

    @SuppressWarnings("unused")
    private static final String TAG = GoldSoftEyeling.class.getSimpleName();
    
    public GoldSoftEyeling() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 9; }

}
