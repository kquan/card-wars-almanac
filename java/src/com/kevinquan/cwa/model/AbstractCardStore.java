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
    
    protected abstract void init();
    
    protected void addCard(Card card) {
        if (mCards.containsKey(card.getId())) {
            System.err.println("Card store already contains "+card.getId());
        }
        mCards.put(card.getId(), card);
    }
    
    @Override
    public List<Card> getCards() {
        List<Card> cardList = new ArrayList<Card>();
        cardList.addAll(mCards.values());
        return cardList;
    }
    
    public Card getCardById(String id) {
        if (id == null || id.trim().isEmpty()) {
            return null;
        }
        return mCards.get(id);
    }

}
