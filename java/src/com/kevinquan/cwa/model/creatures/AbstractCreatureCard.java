package com.kevinquan.cwa.model.creatures;

import com.kevinquan.cwa.model.AbstractCard;

public abstract class AbstractCreatureCard extends AbstractCard implements Creature {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractCreatureCard.class.getSimpleName();
    
    protected boolean mIsGold;
    
    protected AbstractCreatureCard(String name, int cost, Faction faction, Rarity rarity) {
        super(name, cost, faction, rarity);
        mIsGold = false;
    }
    
    public String getFloopDescription() {
        return getDescription();
    }
}
