package com.kevinquan.cwa.model.creatures.rainbow;

public class OrdinaryNinja extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = OrdinaryNinja.class.getSimpleName();
    
    public OrdinaryNinja() {
        super("Ordinary Ninja", 1, Rarity.Cool);
        mDescription = "Deal 3 Damage to creature in opposing lane";
    }

    @Override public int getInitialAttack() { return 4; }
    @Override public int getInitialDefense() { return 1; }
    @Override public int getFloopCost() { return 2; }

}
