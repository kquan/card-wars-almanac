package com.kevinquan.cwa.model.creatures.nice;

public class GoldAngelHeart extends AngelHeart {

    @SuppressWarnings("unused")
    private static final String TAG = GoldAngelHeart.class.getSimpleName();
    
    public GoldAngelHeart() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 1; }
    @Override public int getInitialDefense() { return 9; }

}
