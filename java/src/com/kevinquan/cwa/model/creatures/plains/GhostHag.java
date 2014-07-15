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

public class GhostHag extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = GhostHag.class.getSimpleName();
    
    public GhostHag() {
        super("Ghost Hag", 5, Rarity.AlgebraicRare);
        mDescription = "Choose a friendly creature and negate all Damage, Defense, and Attack modifiers on it"; // Check
    }

    @Override public int getInitialAttack() { return 10; }
    @Override public int getInitialDefense() { return 28; }
    @Override public int getFloopCost() { return 3; } // Check

}
