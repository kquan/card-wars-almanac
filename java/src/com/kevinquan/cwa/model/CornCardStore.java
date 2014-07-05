package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;

public class CornCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = CornCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new Cornball());
        addCard(new EthanAllfire());
    }

}
