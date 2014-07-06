package com.kevinquan.cwa.model.creatures.nice;

public class GoldFatGoat extends FatGoat {

    @SuppressWarnings("unused")
    private static final String TAG = GoldFatGoat.class.getSimpleName();
    
    public GoldFatGoat() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 7; }
    @Override public int getInitialDefense() { return 21; }

}
