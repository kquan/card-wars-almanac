package com.kevinquan.cwa.model.creatures.nice;

public class SnakeMint extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = SnakeMint.class.getSimpleName();
    
    public SnakeMint() {
        super("Snake Mint", 2, Rarity.Nice);
        mDescription = "Deal 2 Damage to creature in opposing lane and heal this creature 4 points";
    }

    @Override public int getInitialAttack() { return 9; }
    @Override public int getInitialDefense() { return 9; }
    @Override public int getFloopCost() { return 2; }

}
