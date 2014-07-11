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

import com.kevinquan.cwa.model.creatures.corn.ArcherDan;
import com.kevinquan.cwa.model.creatures.corn.CornDog;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.GoldCornball;
import com.kevinquan.cwa.model.creatures.corn.GoldEthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.GoldHuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.GoldTravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.WallOfEars;

public class CornCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = CornCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new Cornball());
        addCard(new EthanAllfire());
        addCard(new HuskerKnight());
        addCard(new HuskerWorm());
        addCard(new TravelinFarmer());
        
        // Nice cards
        addCard(new ArcherDan());
        addCard(new CornDog());
        addCard(new WallOfEars());
        
        // Gold cards
        addCard(new GoldCornball());
        addCard(new GoldEthanAllfire());
        addCard(new GoldHuskerWorm());
        addCard(new GoldTravelinFarmer());        
    }

}
