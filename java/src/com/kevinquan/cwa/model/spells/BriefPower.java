package com.kevinquan.cwa.model.spells;

public class BriefPower extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = BriefPower.class.getSimpleName();
    
    public BriefPower() {
        super("Brief Power", 1, Rarity.FiveStars);
        mDescription = "Every card cast this turn costs 1 less Magic point";
    }

}
