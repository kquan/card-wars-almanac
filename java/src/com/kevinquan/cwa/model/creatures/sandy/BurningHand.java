package com.kevinquan.cwa.model.creatures.sandy;

public class BurningHand extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = BurningHand.class.getSimpleName();
    
    public BurningHand() {
        super("Burning Hand", 1, Rarity.Cool);
        mDescription = "Lower the Defense of creature in opposite lane by 2";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 2; }
    @Override public int getFloopCost() { return 1; }

}
