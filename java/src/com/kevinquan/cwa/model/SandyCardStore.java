package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;

public class SandyCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SandyCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new BurningHand());
        addCard(new GreenCactaball());
        addCard(new MsMummy());
        addCard(new SandAngel());
        addCard(new SandEyebat());
    }

}