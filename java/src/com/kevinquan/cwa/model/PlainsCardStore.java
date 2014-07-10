package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;

public class PlainsCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = PlainsCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new CoolDog());
        addCard(new GrapeSlimey());
        addCard(new HeavenlyGazer());
        addCard(new Poultrygeist());
        addCard(new WoadicTimeWalker());
        
        // Nice cards
        addCard(new AncientScholar());
        addCard(new Axey());
        addCard(new DragonClaw());
    }

}
