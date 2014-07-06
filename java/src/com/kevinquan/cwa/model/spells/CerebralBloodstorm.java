package com.kevinquan.cwa.model.spells;

public class CerebralBloodstorm extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = CerebralBloodstorm.class.getSimpleName();
    
    public CerebralBloodstorm() {
        super("Cerebral Bloodstorm", 3, Rarity.Cool);
        mDescription = "Choose an opposing creature and deal Damage equal to its own Attack";
    }

}
