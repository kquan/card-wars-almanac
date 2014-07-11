package com.kevinquan.cwa.model.spells;

public class HotDogRain extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = HotDogRain.class.getSimpleName();
    
    public HotDogRain() {
        super("Hot Dog Rain", 1, Rarity.Rare);
        mDescription = "Opponent cannot summon Buildings next turn"; // Check
    }

}
