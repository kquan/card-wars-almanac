package com.kevinquan.cwa.model.creatures.nice;

public class GoldSnuggleTree extends SnuggleTree {

    @SuppressWarnings("unused")
    private static final String TAG = GoldSnuggleTree.class.getSimpleName();
    
    public GoldSnuggleTree() {
        super();
        mIsGold = true;
    }

    @Override public int getInitialAttack() { return 4; }
    @Override public int getInitialDefense() { return 23; }

}
