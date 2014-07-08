package com.kevinquan.cwa.model.creatures.rainbow;

public class EvilEye extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = EvilEye.class.getSimpleName();
    
    public EvilEye() {
        super("Evil Eye", 1, Rarity.Nice);
        mDescription = "Lower the Attack of the creature in the opposing lane by 4";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 1; }

}
