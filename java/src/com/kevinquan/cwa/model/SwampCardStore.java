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

import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GreenMerman;
import com.kevinquan.cwa.model.creatures.swamp.Herculeye;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.SnappyDresser;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
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
    }

}
