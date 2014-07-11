package com.kevinquan.cwa.model.spells;

public class DoorOfStrength extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = DoorOfStrength.class.getSimpleName();
    
    public DoorOfStrength() {
        super("Door of Strength", 3, Rarity.AlgebraicRare);
        mDescription = "Opponent cannot summon Creatures next turn"; // Check
    }

}
