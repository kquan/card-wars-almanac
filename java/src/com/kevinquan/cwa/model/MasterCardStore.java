package com.kevinquan.cwa.model;


public class MasterCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = MasterCardStore.class.getSimpleName();

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
