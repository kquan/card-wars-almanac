/*
 * Copyright 2014 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
    public String getDescription() {
        return mDescription;
    }

    @Override
    public Faction getFaction() {
        return mFaction;
    }

    @Override 
    public String getId() {
        return mName+"|"+(mRarity != null ? mRarity.toString() : "");
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public Rarity getRarity() {
        return mRarity;
    }
    
    public AbstractCard setDescription(String description) {
        mDescription = description;
        return this;
    }

}
