package com.kevinquan.cwa.model.creatures.swamp;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractSwampCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractSwampCreature.class.getSimpleName();
    
    protected AbstractSwampCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.UselessSwamp, rarity);
    }

}
