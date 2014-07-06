package com.kevinquan.cwa.model.creatures.nice;

public class SnuggleTree extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = SnuggleTree.class.getSimpleName();
    
    public SnuggleTree() {
        super("Snuggle Tree", 2, Rarity.Nice);
        mDescription = "Heal this creature and adjacent creatures 4 points";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 15; }
    @Override public int getFloopCost() { return 3; }

}
