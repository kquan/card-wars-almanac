package com.kevinquan.cwa.model.creatures;

import com.kevinquan.cwa.model.Card;

public interface Creature extends Card {

    int getInitialAttack();
    int getInitialDefense();
    
    int getFloopCost();
    
    boolean isGold();
}
