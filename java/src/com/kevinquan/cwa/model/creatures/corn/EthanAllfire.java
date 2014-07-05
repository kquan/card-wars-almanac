package com.kevinquan.cwa.model.creatures.corn;

public class EthanAllfire extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = EthanAllfire.class.getSimpleName();
    
    public EthanAllfire() {
        super("Ethan Allfire", 1, Rarity.Cool);
        mDescription = "Lower the attack of the opposing creature by 3 and destroy this creature";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 1; }
    @Override public int getFloopCost() { return 1; }

}
