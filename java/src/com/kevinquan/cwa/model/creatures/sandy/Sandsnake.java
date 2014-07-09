package com.kevinquan.cwa.model.creatures.sandy;

public class Sandsnake extends AbstractSandyCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Sandsnake.class.getSimpleName();
    
    public Sandsnake() {
        super(Sandsnake.class.getSimpleName(), 2, Rarity.Nice);
        mDescription = "Lower the Defense of creature in the opposite lane by 5";
    }

    @Override public int getInitialAttack() { return 12; }
    @Override public int getInitialDefense() { return 7; }
    @Override public int getFloopCost() { return 3; }

}
