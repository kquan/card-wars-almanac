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

import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.FatGoat;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.GoldAngelHeart;
import com.kevinquan.cwa.model.creatures.nice.GoldFatGoat;
import com.kevinquan.cwa.model.creatures.nice.GoldFluffapillar;
import com.kevinquan.cwa.model.creatures.nice.GoldNicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.nice.GoldSnuggleTree;
import com.kevinquan.cwa.model.creatures.nice.GoldSoftEyeling;
import com.kevinquan.cwa.model.creatures.nice.NicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.nice.SnakeMint;
import com.kevinquan.cwa.model.creatures.nice.SnuggleTree;
import com.kevinquan.cwa.model.creatures.nice.SoftEyeling;
import com.kevinquan.cwa.model.creatures.nice.TravelinWizard;

public class NiceCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = NiceCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new AngelHeart());
        addCard(new BlueberryDjini());
        addCard(new FairyShepard());
        addCard(new Fluffapillar());
        addCard(new SoftEyeling());
        
        // Nice cards
        addCard(new SnuggleTree());
        addCard(new FatGoat());
        addCard(new NicelandsEyeBat());
        addCard(new SnakeMint());
        
        // Very Rare cards
        addCard(new TravelinWizard());
        
        // Gold
        addCard(new GoldAngelHeart());
        addCard(new GoldFluffapillar());
        addCard(new GoldSoftEyeling());
        addCard(new GoldSnuggleTree());
        addCard(new GoldFatGoat());
        addCard(new GoldNicelandsEyeBat());
    }

}
