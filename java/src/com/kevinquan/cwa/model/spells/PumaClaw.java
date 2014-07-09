package com.kevinquan.cwa.model.spells;

public class PumaClaw extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = PumaClaw.class.getSimpleName();
    
    public PumaClaw() {
        super("Puma Claw", 2, Rarity.Nice);
        mDescription = "Choose a Blue Plains creature and attack the opposing creature in its lane";
    }

}
