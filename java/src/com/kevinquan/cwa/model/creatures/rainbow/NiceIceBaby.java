package com.kevinquan.cwa.model.creatures.rainbow;

public class NiceIceBaby extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = NiceIceBaby.class.getSimpleName();
    
    public NiceIceBaby() {
        super("Nice Ice Baby", 1, Rarity.Cool);
        mDescription = "Creature in opposing lane cannot Attack next Battle Phase";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 2; }

}
