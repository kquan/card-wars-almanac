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
package com.kevinquan.cwa.model.creatures.plains;

public class XLargeSpiritSoldier extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = XLargeSpiritSoldier.class.getSimpleName();
    
    public XLargeSpiritSoldier() {
        super("X-Large Spirit Soldier", 5, Rarity.AlgebraicRare);
        mDescription = "Return this creature to your hand and draw 1 card"; // Check
    }

    @Override public int getBaseAttack() { return 5; }
    @Override public int getBaseDefense() { return 40; }
    @Override public int getFloopCost() { return 1; }

    @Override public int getBaseGoldAttack() { return 7; }
    @Override public int getBaseGoldDefense() { return 60; }
}
