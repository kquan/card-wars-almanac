package com.kevinquan.cwa.model.spells;

import com.kevinquan.cwa.model.AbstractCard;

public abstract class AbstractSpellCard extends AbstractCard implements Spell {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractSpellCard.class.getSimpleName();

    protected AbstractSpellCard(String name, int cost, Rarity rarity) {
        super(name, cost, Faction.Rainbow, rarity);
    }

}
