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

public class DragonFoot extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = DragonFoot.class.getSimpleName();
    
    public DragonFoot() {
        super("Dragon Foot", 4, Rarity.VeryRare);
        mDescription = "Destroy Building in the opposing lane"; // Check
    }

    @Override public int getBaseAttack() { return 5; }
    @Override public int getBaseDefense() { return 32; }
    @Override public int getFloopCost() { return 3; }

    @Override public int getBaseGoldAttack() { return 7; }
    @Override public int getBaseGoldDefense() { return 48; }
}
