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

public class AppleTree extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = AppleTree.class.getSimpleName();
    
    public AppleTree() {
        super("Apple Tree", 0, Rarity.AlgebraicRare);
        mDescription = "Fully heal all of your creatures and destroy this creature";
    }

    @Override public int getInitialAttack() { return 9; }
    @Override public int getInitialDefense() { return 21; }
    @Override public int getFloopCost() { return 1; }

}
