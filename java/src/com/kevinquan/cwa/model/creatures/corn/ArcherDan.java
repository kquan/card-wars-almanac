package com.kevinquan.cwa.model.creatures.corn;

public class ArcherDan extends AbstractCornCreature {

    @SuppressWarnings("unused")
    private static final String TAG = ArcherDan.class.getSimpleName();
    
    public ArcherDan() {
        super("Archer Dan", 2, Rarity.Nice);
        mDescription = "Choose an opposing creature and lower its Attack by 4";
    }

    @Override public int getInitialAttack() { return 12; }
    @Override public int getInitialDefense() { return 6; }
    @Override public int getFloopCost() { return 2; }

}
