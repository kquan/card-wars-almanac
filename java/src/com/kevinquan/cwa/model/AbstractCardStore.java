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

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public abstract class AbstractCardStore implements CardStore {

    @SuppressWarnings("unused")
    private static final String TAG = AbstractCardStore.class.getSimpleName();

    protected Hashtable<String, Card> mCards;
    
    protected AbstractCardStore() {
        mCards = new Hashtable<String, Card>();
        init();
    }
    
    protected void addCard(Card card) {
        if (mCards.containsKey(card.getId())) {
            System.err.println("Card store already contains "+card.getId());
        }
        mCards.put(card.getId(), card);
    }
    
    @Override
    public Card getCardById(String id) {
        if (id == null || id.trim().isEmpty()) {
            return null;
        }
        return mCards.get(id);
    }
    
    @Override
    public List<Card> getCards() {
        List<Card> cardList = new ArrayList<Card>();
        cardList.addAll(mCards.values());
        return cardList;
    }
    
    protected abstract void init();

}
