package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;

public class SwampCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SwampCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new GrayEyebat());
        addCard(new MaceStump());
        addCard(new OrangeSlimey());
        addCard(new TeethLeaf());
        addCard(new WanderingBaldMan());
    }

}
