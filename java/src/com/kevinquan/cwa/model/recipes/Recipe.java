package com.kevinquan.cwa.model.recipes;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.Card;

public class Recipe {

    @SuppressWarnings("unused")
    private static final String TAG = Recipe.class.getSimpleName();
    
    public static class Ingredient {

        protected Card mCard;
        protected int mCardCount;
        
        public Ingredient(Card card, int count) {
            mCard = card;
            mCardCount = count;
        }
        
        public Ingredient(Card card) {
            mCard = card;
            mCardCount = 1;
        }

        public Card getCard() {
            return mCard;
        }

        public int getCardCount() {
            return mCardCount;
        }
    }
    
    protected int mCost;
    
    protected List<Ingredient> mIngredients;
    protected Card mResult;

    protected Recipe() {
        mIngredients = new ArrayList<Ingredient>();
    }
    
    public Recipe(Card card1, Card card2, int cost, Card result) {
        this();
        addIngredient(card1).addIngredient(card2).setCost(cost).setResult(result);
    }
    
    public Recipe(Card card1, Card card2, Card card3, int cost, Card result) {
        this();
        addIngredient(card1).addIngredient(card2).addIngredient(card3).setCost(cost).setResult(result);
    }
    
    public Recipe(int cost, Card result) {
        this();
        setCost(cost).setResult(result);
    }
    
    public boolean uses(Card ingredient) {
        for (Ingredient component : mIngredients) {
            if (component.getCard().getClass().isInstance(ingredient)) {
                return true;
            }
        }
        return false;
    }
    
    public Recipe addIngredient(Card card) {
        mIngredients.add(new Ingredient(card));
        return this;
    }
    
    public Recipe addIngredient(Card card, int count) {
        mIngredients.add(new Ingredient(card, count));
        return this;
    }
    
    public Recipe setCost(int cost) {
        mCost = cost;
        return this;
    }
    
    public Recipe setResult(Card card) {
        mResult = card;
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

}
