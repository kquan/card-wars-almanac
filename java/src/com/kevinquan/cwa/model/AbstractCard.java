package com.kevinquan.cwa.model;


public abstract class AbstractCard implements Card {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractCard.class.getSimpleName();
    
    protected String mName;
    protected String mDescription;
    
    protected int mCost;
    protected Faction mFaction;
    protected Rarity mRarity;
    
    protected AbstractCard(String name, int cost, Faction faction, Rarity rarity) {
        mName = name;
        mCost = cost;
        mFaction = faction;
        mRarity = rarity;
    }

    @Override
    public int getCost() {
        return mCost;
    }

    @Override
    public Faction getFaction() {
        return mFaction;
    }

    @Override
    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public AbstractCard setDescription(String description) {
        mDescription = description;
        return this;
    }

    @Override
    public Rarity getRarity() {
        return mRarity;
    }

}
