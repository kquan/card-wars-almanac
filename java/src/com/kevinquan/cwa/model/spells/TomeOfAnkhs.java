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

public class TomeOfAnkhs extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = TomeOfAnkhs.class.getSimpleName();
    
    public TomeOfAnkhs() {
        super("Tome of Ankhs", 2, Rarity.Nice);
        mDescription = "Choose a Sandy Lands creature and attack the opposing creature in its lane";
    }

}
