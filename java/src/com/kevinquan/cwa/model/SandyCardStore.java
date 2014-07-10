package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.sandy.BeachMum;
import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.LimeSlimey;
import com.kevinquan.cwa.model.creatures.sandy.MayonaiseAngel;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.Sandsnake;

public class SandyCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SandyCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new BurningHand());
        addCard(new GreenCactaball());
        addCard(new MsMummy());
        addCard(new SandAngel());
        addCard(new SandEyebat());
        
        // Nice cards
        addCard(new BeachMum());
        addCard(new LimeSlimey());
        addCard(new MayonaiseAngel());
        addCard(new Sandsnake());
    }

}