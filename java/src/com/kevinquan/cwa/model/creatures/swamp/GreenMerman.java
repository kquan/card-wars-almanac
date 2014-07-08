package com.kevinquan.cwa.model.creatures.swamp;

public class GreenMerman extends AbstractSwampCreature {

    @SuppressWarnings("unused")
    private static final String TAG = GreenMerman.class.getSimpleName();
    
    public GreenMerman() {
        super("Green Merman", 2, Rarity.Nice);
        mDescription = "Deal 3 Damage for each enemy building to the creature in the opposing lane";
    }

    @Override public int getInitialAttack() { return 6; }
    @Override public int getInitialDefense() { return 12; }
    @Override public int getFloopCost() { return 2; }

}
