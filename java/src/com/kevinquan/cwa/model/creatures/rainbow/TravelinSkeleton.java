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
package com.kevinquan.cwa.model.creatures.rainbow;

public class TravelinSkeleton extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TravelinSkeleton.class.getSimpleName();
    
    public TravelinSkeleton() {
        super("Travelin' Skeleton", 1, Rarity.Cool);
        mDescription = "Deal 4 Damage to a random creature, including your own";
    }

    @Override public int getBaseAttack() { return 2; }
    @Override public int getBaseDefense() { return 3; }
    @Override public int getFloopCost() { return 1; }

    @Override public int getBaseGoldAttack() { return 3; }
    @Override public int getBaseGoldDefense() { return 5; }
}
