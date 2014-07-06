package com.kevinquan.cwa.model.creatures.plains;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractPlainsCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractPlainsCreature.class.getSimpleName();
    
    protected AbstractPlainsCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.BluePlains, rarity);
    }

}
