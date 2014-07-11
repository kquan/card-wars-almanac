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
package com.kevinquan.cwa.model.spells;

public class ZaZosMagicSeeds extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = ZaZosMagicSeeds.class.getSimpleName();
    
    public ZaZosMagicSeeds() {
        super("ZaZo's Magic Seeds", 1, Rarity.AlgebraicRare);
        mDescription = "Gain 1 Magic Point for each of your creatures on the field"; // Check
    }

}
