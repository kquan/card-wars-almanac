package com.kevinquan.cwa.model.creatures.rainbow;

public class WhiteNinja extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = WhiteNinja.class.getSimpleName();
    
    public WhiteNinja() {
        super("White Ninja", 2, Rarity.Nice);
        mDescription = "Deal 3 Damage to the opposing creature and heal 3 points from this creature";
    }

    @Override public int getInitialAttack() { return 7; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 2; }

}
