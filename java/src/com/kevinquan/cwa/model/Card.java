package com.kevinquan.cwa.model;


public interface Card {
    
    public enum Faction {
        CornFields,
        BluePlains,
        NiceLands,
        UselessSwamp,
        SandyLands,
        Rainbow,
        ;
    }
    
    public enum Rarity {
        Cool,
        Nice,
        Rare,
        VeryRare,
        AlgebraicRare,
        ;
    }

    String getId();
    String getName();
    String getDescription();
    
    int getCost();
    Faction getFaction();
    Rarity getRarity();
   
}
