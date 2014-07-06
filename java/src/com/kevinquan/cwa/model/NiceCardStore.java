package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;

public class NiceCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = NiceCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new AngelHeart());
        addCard(new BlueberryDjini());
        addCard(new FairyShepard());
        addCard(new Fluffapillar());
    }

}
