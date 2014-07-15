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

import com.kevinquan.cwa.model.creatures.swamp.BaldMansThrone;
import com.kevinquan.cwa.model.creatures.swamp.ChestBuster;
import com.kevinquan.cwa.model.creatures.swamp.DarkAngel;
import com.kevinquan.cwa.model.creatures.swamp.DaveyBear;
import com.kevinquan.cwa.model.creatures.swamp.DrDeath;
import com.kevinquan.cwa.model.creatures.swamp.EyeGuy;
import com.kevinquan.cwa.model.creatures.swamp.GoldChestBuster;
import com.kevinquan.cwa.model.creatures.swamp.GoldDarkAngel;
import com.kevinquan.cwa.model.creatures.swamp.GoldDrDeath;
import com.kevinquan.cwa.model.creatures.swamp.GoldGrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GoldHerculeye;
import com.kevinquan.cwa.model.creatures.swamp.GoldImmortalMaizeWalker;
import com.kevinquan.cwa.model.creatures.swamp.GoldOrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.GoldRainbowBarfer;
import com.kevinquan.cwa.model.creatures.swamp.GoldRecordThug;
import com.kevinquan.cwa.model.creatures.swamp.GoldSnappyDresser;
import com.kevinquan.cwa.model.creatures.swamp.GoldSteakChop;
import com.kevinquan.cwa.model.creatures.swamp.GoldTeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.GoldTreeOfUnderneath;
import com.kevinquan.cwa.model.creatures.swamp.GoldWanderingBaldMan;
import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GreenMermaid;
import com.kevinquan.cwa.model.creatures.swamp.GreenMerman;
import com.kevinquan.cwa.model.creatures.swamp.Herculeye;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.ImmortalMaizeWalker;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.MamaSpider;
import com.kevinquan.cwa.model.creatures.swamp.MarkyMark;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.RainbowBarfer;
import com.kevinquan.cwa.model.creatures.swamp.RecordThug;
import com.kevinquan.cwa.model.creatures.swamp.RedEyeling;
import com.kevinquan.cwa.model.creatures.swamp.SnappyDresser;
import com.kevinquan.cwa.model.creatures.swamp.SteakChop;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.TreeOfUnderneath;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;

public class SwampCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = SwampCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new GrayEyebat());
        addCard(new MaceStump());
        addCard(new OrangeSlimey());
        addCard(new TeethLeaf());
        addCard(new WanderingBaldMan());
        
        // Nice cards
        addCard(new GreenMerman());
        addCard(new Herculeye());
        addCard(new HotEyebat());
        addCard(new SnappyDresser());
        
        // Rare cards
        addCard(new GreenMermaid());
        addCard(new RecordThug());
        addCard(new RedEyeling());
        addCard(new TreeOfUnderneath());
        
        // Very Rare cards
        addCard(new ChestBuster());
        addCard(new DarkAngel());
        addCard(new MamaSpider());
        addCard(new SteakChop());
        
        // Algebraic cards
        addCard(new BaldMansThrone());
        addCard(new DaveyBear());
        addCard(new DrDeath());
        addCard(new EyeGuy());
        addCard(new ImmortalMaizeWalker());
        addCard(new MarkyMark());
        addCard(new RainbowBarfer());
        
        // Gold cards
        addCard(new GoldGrayEyebat());
        addCard(new GoldOrangeSlimey());
        addCard(new GoldTeethLeaf());
        addCard(new GoldWanderingBaldMan());
        addCard(new GoldHerculeye());
        addCard(new GoldSnappyDresser());
        addCard(new GoldRecordThug());
        addCard(new GoldTreeOfUnderneath());
        addCard(new GoldChestBuster());
        addCard(new GoldDarkAngel());
        addCard(new GoldSteakChop());
        addCard(new DaveyBear());
        addCard(new GoldDrDeath());
        addCard(new GoldImmortalMaizeWalker());
        addCard(new GoldRainbowBarfer());
    }

}
