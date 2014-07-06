package com.kevinquan.cwa.model.creatures.nice;

public class GoldFluffapillar extends Fluffapillar {

    @SuppressWarnings("unused")
    private static final String TAG = GoldFluffapillar.class.getSimpleName();
    
    public GoldFluffapillar() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 8; }

}
