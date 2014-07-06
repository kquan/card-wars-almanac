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
        ThreeStars,
        FourStars,
        FiveStars,
        ;
    }

    String getId();
    String getName();
    
    int getCost();
    Faction getFaction();
    Rarity getRarity();
   
}
