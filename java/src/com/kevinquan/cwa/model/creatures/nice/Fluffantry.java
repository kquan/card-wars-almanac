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
package com.kevinquan.cwa.model.creatures.nice;

public class Fluffantry extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Fluffantry.class.getSimpleName();
    
    public Fluffantry() {
        super("Fluffantry", 5, Rarity.AlgebraicRare);
        mDescription = "Heal your Hero 2 points for each of your creatures on the field"; // Check
    }

    @Override public int getBaseAttack() { return 20; }
    @Override public int getBaseDefense() { return 25; }
    @Override public int getFloopCost() { return 3; }
    
    @Override public int getBaseGoldAttack() { return 30; }
    @Override public int getBaseGoldDefense() { return 38; }

}
