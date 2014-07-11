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

public class UltimateMagicHands extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = UltimateMagicHands.class.getSimpleName();
    
    public UltimateMagicHands() {
        super("Ultimate Magic Hands", 3, Rarity.AlgebraicRare);
        mDescription = "Choose an opposing creature and send it back to your opponent's hand"; // Check
    }

}
