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
    
    @Override
    public String getId() {
        return super.getId()+(mIsGold ? "|GOLD" : "");
    }
    
    @Override
    public String getFloopDescription() {
        return getDescription();
    }
    
    @Override
    public boolean hasGoldVersion() {
        return getBaseGoldDefense() > 0 || getBaseAttack() > 0;
    }
    
    @Override
    public Creature setGold(boolean isGoldVersion) {
        mIsGold = true;
        return this;
    }
    
    @Override public boolean isGold() { return mIsGold; }
    
    @Override public int getBaseGoldAttack() { return 0; }
    @Override public int getBaseGoldDefense() { return 0; }
    
    @Override 
    public int getAttack() { 
        if (mIsGold) {
            return getBaseGoldAttack();
        }
        return getBaseAttack();
    }
    
    @Override 
    public int getDefense() { 
        if (mIsGold) {
            return getBaseGoldDefense();
        }
        return getBaseDefense();
    }
    
}
