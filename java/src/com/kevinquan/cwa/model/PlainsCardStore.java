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
package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;

public class PlainsCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = PlainsCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new CoolDog());
        addCard(new GrapeSlimey());
        addCard(new HeavenlyGazer());
        addCard(new Poultrygeist());
        addCard(new WoadicTimeWalker());
        
        // Nice cards
        addCard(new AncientScholar());
        addCard(new Axey());
        addCard(new DragonClaw());
    }

}
