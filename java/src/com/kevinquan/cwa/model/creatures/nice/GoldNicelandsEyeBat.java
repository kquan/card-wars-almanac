package com.kevinquan.cwa.model.creatures.nice;

public class GoldNicelandsEyeBat extends NicelandsEyeBat {

    @SuppressWarnings("unused")
    private static final String TAG = GoldNicelandsEyeBat.class.getSimpleName();
    
    public GoldNicelandsEyeBat() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 10; }
    @Override public int getInitialDefense() { return 15; }

}
