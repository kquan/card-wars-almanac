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
import com.kevinquan.cwa.model.creatures.plains.CameraDude;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DiamondDan;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.DragonFoot;
import com.kevinquan.cwa.model.creatures.plains.EmbarrassingBard;
import com.kevinquan.cwa.model.creatures.plains.GhostHag;
import com.kevinquan.cwa.model.creatures.plains.GoldAncientScholar;
import com.kevinquan.cwa.model.creatures.plains.GoldCoolDog;
import com.kevinquan.cwa.model.creatures.plains.GoldDiamondDan;
import com.kevinquan.cwa.model.creatures.plains.GoldGhostHag;
import com.kevinquan.cwa.model.creatures.plains.GoldGrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.GoldHeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.GoldPsionicArchitect;
import com.kevinquan.cwa.model.creatures.plains.GoldPunkCat;
import com.kevinquan.cwa.model.creatures.plains.GoldStruzannJinn;
import com.kevinquan.cwa.model.creatures.plains.GoldWoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.plains.GoldXLargeSpiritSoldier;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Heifergeist;
import com.kevinquan.cwa.model.creatures.plains.InfiniteFigure;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.PsionicArchitect;
import com.kevinquan.cwa.model.creatures.plains.PunkCat;
import com.kevinquan.cwa.model.creatures.plains.StruzannJinn;
import com.kevinquan.cwa.model.creatures.plains.TemporalWisp;
import com.kevinquan.cwa.model.creatures.plains.TimmyMagicEyes;
import com.kevinquan.cwa.model.creatures.plains.WoadicChief;
import com.kevinquan.cwa.model.creatures.plains.WoadicMarauder;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.plains.XLargeSpiritSoldier;

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
        
        // Rare cards
        addCard(new Heifergeist());
        addCard(new PsionicArchitect());
        addCard(new PunkCat());
        addCard(new TemporalWisp());
        
        // Very rare cards
        addCard(new DragonFoot());
        addCard(new StruzannJinn());
        addCard(new WoadicMarauder());
        
        // Algebraic rare cards
        addCard(new CameraDude());
        addCard(new DiamondDan());
        addCard(new EmbarrassingBard());
        addCard(new GhostHag());
        addCard(new InfiniteFigure());
        addCard(new TimmyMagicEyes());
        addCard(new WoadicChief());
        addCard(new XLargeSpiritSoldier());
        
        // Gold cards
        addCard(new GoldCoolDog());
        addCard(new GoldGrapeSlimey());
        addCard(new GoldHeavenlyGazer());
        addCard(new GoldWoadicTimeWalker());
        addCard(new GoldAncientScholar());
        addCard(new GoldPsionicArchitect());
        addCard(new GoldPunkCat());
        addCard(new GoldStruzannJinn());
        addCard(new GoldWoadicTimeWalker());
        addCard(new GoldDiamondDan());
        addCard(new GoldGhostHag());
        addCard(new GoldXLargeSpiritSoldier());
    }

}
