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

public class TemporalWisp extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TemporalWisp.class.getSimpleName();
    
    public TemporalWisp() {
        super("Temporal Wisp", 3, Rarity.Rare);
        mDescription = "Opposing creature cannot attack on opponent's next Battle Phase"; // Check
    }

    @Override public int getInitialAttack() { return 9; }
    @Override public int getInitialDefense() { return 17; }
    @Override public int getFloopCost() { return 2; }

}
