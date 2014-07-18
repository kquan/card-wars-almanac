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
package com.kevinquan.cwa.model.creatures.sandy;

public class CactusThug extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = CactusThug.class.getSimpleName();
    
    public CactusThug() {
        super("Cactus Thug", 5, Rarity.AlgebraicRare);
        mDescription = "Deal damage to creature in opposing lane equal to this creature's Defense"; // Check
    }

    @Override public int getBaseAttack() { return 25; }
    @Override public int getBaseDefense() { return 12; }
    @Override public int getFloopCost() { return 2; }

    @Override public int getBaseGoldAttack() { return 37; }
    @Override public int getBaseGoldDefense() { return 18; }
}
