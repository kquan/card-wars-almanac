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
import com.kevinquan.cwa.model.creatures.sandy.CactusThug;
import com.kevinquan.cwa.model.creatures.sandy.Fummy;
import com.kevinquan.cwa.model.creatures.sandy.GoldBeachMum;
import com.kevinquan.cwa.model.creatures.sandy.GoldBurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GoldCactusThug;
import com.kevinquan.cwa.model.creatures.sandy.GoldFummy;
import com.kevinquan.cwa.model.creatures.sandy.GoldGreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.GoldLostGolem;
import com.kevinquan.cwa.model.creatures.sandy.GoldMsMummy;
import com.kevinquan.cwa.model.creatures.sandy.GoldPieclops;
import com.kevinquan.cwa.model.creatures.sandy.GoldSandAngel;
import com.kevinquan.cwa.model.creatures.sandy.GoldSandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.GoldSandJackal;
import com.kevinquan.cwa.model.creatures.sandy.GoldSandy;
import com.kevinquan.cwa.model.creatures.sandy.GoldWallOfSand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.GreenPartyOgre;
import com.kevinquan.cwa.model.creatures.sandy.LadyMary;
import com.kevinquan.cwa.model.creatures.sandy.LimeSlimey;
import com.kevinquan.cwa.model.creatures.sandy.LostGolem;
import com.kevinquan.cwa.model.creatures.sandy.MayonaiseAngel;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.MudAngel;
import com.kevinquan.cwa.model.creatures.sandy.Pieclops;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.SandJackal;
import com.kevinquan.cwa.model.creatures.sandy.SandKnight;
import com.kevinquan.cwa.model.creatures.sandy.SandSnake;
import com.kevinquan.cwa.model.creatures.sandy.SandasaurusRex;
import com.kevinquan.cwa.model.creatures.sandy.Sandfoot;
import com.kevinquan.cwa.model.creatures.sandy.Sandwitch;
import com.kevinquan.cwa.model.creatures.sandy.Sandy;
import com.kevinquan.cwa.model.creatures.sandy.WallOfSand;

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
        
        // Rare cards
        addCard(new MudAngel());
        addCard(new Sandfoot());
        addCard(new SandJackal());
        addCard(new WallOfSand());
        
        // Very rare cards
        addCard(new Fummy());
        addCard(new SandKnight());
        addCard(new Sandwitch());
        
        // Algebraic rare cards
        addCard(new CactusThug());
        addCard(new GreenPartyOgre());
        addCard(new LadyMary());
        addCard(new LostGolem());
        addCard(new Pieclops());
        addCard(new SandasaurusRex());
        addCard(new Sandy());
        
        // Gold cards
        addCard(new GoldBurningHand());
        addCard(new GoldGreenCactaball());
        addCard(new GoldMsMummy());
        addCard(new GoldSandAngel());
        addCard(new GoldSandEyebat());
        addCard(new GoldBeachMum());
        addCard(new GoldWallOfSand());
        addCard(new GoldSandJackal());
        addCard(new GoldFummy());
        addCard(new GoldCactusThug());
        addCard(new GoldLostGolem());
        addCard(new GoldPieclops());
        addCard(new GoldSandy());
    }

}