package com.kevinquan.cwa.model.buildings;

import com.kevinquan.cwa.model.AbstractCard;

public abstract class AbstractBuildingCard extends AbstractCard implements Building {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractBuildingCard.class.getSimpleName();

    protected AbstractBuildingCard(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.Rainbow, rarity);
    }

}
