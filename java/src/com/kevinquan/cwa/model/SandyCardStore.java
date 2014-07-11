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

import com.kevinquan.cwa.model.creatures.sandy.BeachMum;
import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.LimeSlimey;
import com.kevinquan.cwa.model.creatures.sandy.MayonaiseAngel;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.SandSnake;

public class SandyCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SandyCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new BurningHand());
        addCard(new GreenCactaball());
        addCard(new MsMummy());
        addCard(new SandAngel());
        addCard(new SandEyebat());
        
        // Nice cards
        addCard(new BeachMum());
        addCard(new LimeSlimey());
        addCard(new MayonaiseAngel());
        addCard(new SandSnake());
    }

}