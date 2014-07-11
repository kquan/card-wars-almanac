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
package com.kevinquan.cwa.model.recipes;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.Card;

public class Recipe {

    public static class Ingredient {

        protected Card mCard;
        protected int mCardCount;
        
        public Ingredient(Card card) {
            mCard = card;
            mCardCount = 1;
        }
        
        public Ingredient(Card card, int count) {
            mCard = card;
            mCardCount = count;
        }

        public Card getCard() {
            return mCard;
        }

        public int getCardCount() {
            return mCardCount;
        }
    }
    
    @SuppressWarnings("unused")
    private static final String TAG = Recipe.class.getSimpleName();
    
    protected int mCost;
    
    protected List<Ingredient> mIngredients;
    protected Card mResult;

    protected Recipe() {
        mIngredients = new ArrayList<Ingredient>();
    }
    
    public Recipe(Card card1, Card card2, Card card3, int cost, Card result) {
        this();
        addIngredient(card1).addIngredient(card2).addIngredient(card3).setCost(cost).setResult(result);
    }
    
    public Recipe(Card card1, Card card2, int cost, Card result) {
        this();
        addIngredient(card1).addIngredient(card2).setCost(cost).setResult(result);
    }
    
    public Recipe(int cost, Card result) {
        this();
        setCost(cost).setResult(result);
    }
    
    public Recipe addIngredient(Card card) {
        mIngredients.add(new Ingredient(card));
        return this;
    }
    
    public Recipe addIngredient(Card card, int count) {
        mIngredients.add(new Ingredient(card, count));
        return this;
    }
    
    public int getCost() {
        return mCost;
    }
    
    public List<Ingredient> getIngredients() {
        return mIngredients;
    }
    
    public Card getResult() {
        return mResult;
    }

    public Recipe setCost(int cost) {
        mCost = cost;
        return this;
    }

    public Recipe setResult(Card card) {
        mResult = card;
        return this;
    }

    public boolean uses(Card ingredient) {
        for (Ingredient component : mIngredients) {
            if (component.getCard().getClass().isInstance(ingredient)) {
                return true;
            }
        }
        return false;
    }    

}
