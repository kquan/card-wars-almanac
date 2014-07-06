package com.kevinquan.cwa.model.creatures.nice;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractNiceCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractNiceCreature.class.getSimpleName();
    
    protected AbstractNiceCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.NiceLands, rarity);
    }

}
