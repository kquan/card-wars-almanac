package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;

public class CornCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = CornCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new Cornball());
        addCard(new EthanAllfire());
        addCard(new HuskerKnight());
        addCard(new HuskerWorm());
        addCard(new TravelinFarmer());
    }

}
