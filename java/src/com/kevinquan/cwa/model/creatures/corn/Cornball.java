package com.kevinquan.cwa.model.creatures.corn;

public class Cornball extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Cornball.class.getSimpleName();
    
    public Cornball() {
        super(Cornball.class.getSimpleName(), 1, Rarity.Cool);
        mDescription = "+1 Attack";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 2; }

}
