package com.kevinquan.cwa.model.creatures.corn;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractCornCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractCornCreature.class.getSimpleName();
    
    protected AbstractCornCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.Corn, rarity);
    }

}
