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

public class MasterCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = MasterCardStore.class.getSimpleName();
    
    private static class MasterCardStoreHolder {
        private static final MasterCardStore INSTANCE = new MasterCardStore();
    }
    
    public static MasterCardStore getInstance() {
        return MasterCardStoreHolder.INSTANCE;
    }
    
    private MasterCardStore() {
        super();
    }

    @Override
    protected void init() {
        for (Card card : new CornCardStore().getCards()) {
            addCard(card);
        }
        for (Card card : new NiceCardStore().getCards()) {
            addCard(card);
        }
        for (Card card : new PlainsCardStore().getCards()) {
            addCard(card);
        }
        for (Card card : new RainbowCardStore().getCards()) {
            addCard(card);
        }
        for (Card card : new SandyCardStore().getCards()) {
            addCard(card);
        }
        for (Card card : new SwampCardStore().getCards()) {
            addCard(card);
        }   
    }

}
