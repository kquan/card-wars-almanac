package com.kevinquan.cwa.model.creatures.rainbow;

import com.kevinquan.cwa.model.creatures.AbstractCreatureCard;

public abstract class AbstractRainbowCreature extends AbstractCreatureCard {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractRainbowCreature.class.getSimpleName();
    
    protected AbstractRainbowCreature(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.Rainbow, rarity);
    }

}
