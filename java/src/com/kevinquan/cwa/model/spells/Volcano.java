package com.kevinquan.cwa.model.spells;

public class Volcano extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = Volcano.class.getSimpleName();
    
    public Volcano() {
        super(Volcano.class.getSimpleName(), 4, Rarity.Cool);
        mDescription = "Choose a lane and destroy all Buildings and Creatures on it (player's and opponent's)";
    }

}
