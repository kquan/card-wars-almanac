package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;

public class PlainsCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = PlainsCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new HeavenlyGazer());
        addCard(new CoolDog());
        addCard(new GrapeSlimey());
        addCard(new Poultrygeist());
        addCard(new WoadicTimeWalker());
    }

}
