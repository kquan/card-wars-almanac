package com.kevinquan.cwa.model.creatures.sandy;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractSandyCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractSandyCreature.class.getSimpleName();
    
    protected AbstractSandyCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.NiceLands, rarity);
    }

}
