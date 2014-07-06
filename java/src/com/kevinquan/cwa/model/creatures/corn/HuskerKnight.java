package com.kevinquan.cwa.model.creatures.corn;

public class HuskerKnight extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = HuskerKnight.class.getSimpleName();
    
    public HuskerKnight() {
        super("Husker Knight", 1, Rarity.Cool);
        mDescription = "Adjacent creatures gain +2 Attack";
    }

    @Override public int getInitialAttack() { return 6; }
    @Override public int getInitialDefense() { return 3; }
    @Override public int getFloopCost() { return 3; }

}
