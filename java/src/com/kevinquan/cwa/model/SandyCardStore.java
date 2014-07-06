package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.sandy.BurningHand;

public class SandyCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SandyCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new BurningHand());
    }

}
