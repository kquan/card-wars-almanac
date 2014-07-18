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
import com.kevinquan.cwa.model.creatures.corn.CaptainTaco;
import com.kevinquan.cwa.model.creatures.corn.CornDog;
import com.kevinquan.cwa.model.creatures.corn.CornLord;
import com.kevinquan.cwa.model.creatures.corn.CornRonin;
import com.kevinquan.cwa.model.creatures.corn.Cornataur;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.FieldReaper;
import com.kevinquan.cwa.model.creatures.corn.FieldStalker;
import com.kevinquan.cwa.model.creatures.corn.HuskerGiant;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.Huskerbat;
import com.kevinquan.cwa.model.creatures.corn.LegionOfEarlings;
import com.kevinquan.cwa.model.creatures.corn.LogKnight;
import com.kevinquan.cwa.model.creatures.corn.PatchyThePumpkin;
import com.kevinquan.cwa.model.creatures.corn.SunKing;
import com.kevinquan.cwa.model.creatures.corn.TheSludger;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.WallOfEars;
import com.kevinquan.cwa.model.creatures.corn.YellowGnome;

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
        
        // Rare cards
        addCard(new CornRonin());
        addCard(new Huskerbat());
        addCard(new PatchyThePumpkin());
        addCard(new TheSludger());
        
        // Very Rare cards
        addCard(new Cornataur());
        addCard(new FieldReaper());
        addCard(new FieldStalker());
        
        // Algebraic Rare cards
        addCard(new CaptainTaco());
        addCard(new CornLord());
        addCard(new HuskerGiant());
        addCard(new LegionOfEarlings());
        addCard(new LogKnight());
        addCard(new SunKing());
        addCard(new YellowGnome());
    }

}
