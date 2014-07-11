/*
 * Copyright 2014 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevinquan.cwa.model.hero;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Hero {

    @SuppressWarnings("unused")
    private static final String TAG = Hero.class.getSimpleName();
    
    public static final Hero JAKE = new Hero("Jake", 3, "All your corn creatures gain +3 Attack");
    public static final Hero FINN = new Hero("Finn", 5, "Gain 2 extra Magic Points for 1 turn");
    public static final Hero BMO = new Hero("BMO", 3, "Gain 2 extra Magic Points for 1 turn");
    public static final Hero MARCELINE = new Hero("Marceline", 3, "All of your creatures gain +2 Attack");
    public static final Hero PRINCESS_BUBBLEGUM = new Hero("Princess Bubblegum", 4, "Fully heal all of your creatures");
    public static final Hero FLAME_PRINCESS = new Hero("Flame Princess", 4, "Draw 2 cards");
    public static final Hero LADY_RAINICORN = new Hero("Lady Rainicorn", 3, "Choose a creature and fully heal it");
    public static final Hero LUMPY_SPACE_PRINCESS = new Hero("Lumpy Space Princess", 3, "Fully heal all of your Plains creatures");
    public static final Hero ASH = new Hero("Ash", 4, "Return any card from the Discard Pile back to your hand");
    public static final Hero RICARDIO = new Hero("Ricardio", 3, "Draw 1 card");
    public static final Hero DR_DONUT = new Hero("Dr Donut", 5, "Return any Creature from the Discard Pile back to your hand");
    
    public static final Hero EARL_OF_LEMONGRAB = new Hero("Earl of Lemongrab", 3, ""); // Check
    public static final Hero ICE_KING = new Hero("Ice King", 4, ""); // Check
    public static final Hero HUNSON_ABADEER = new Hero("Hunson Abadeer", 4, ""); // Check
    public static final Hero GUNTER = new Hero("Gunter", 3, ""); // Check
    public static final Hero FINN_DOCTOR = new Hero("Finn Doctor", 3, ""); // Check
    public static final Hero FINN_PAJAMA = new Hero("Finn Pajama", 3, ""); // Check
    public static final Hero MAGIC_MAN = new Hero("Magic Man", 2, ""); // Check
    public static final Hero PEPPERMINT_BUTLER = new Hero("Peppermint Butler", 2, ""); // Check
    public static final Hero CINAMON_BUNN = new Hero("Cinamon Bunn", 3, ""); // Check
    public static final Hero BANANA_GUARD = new Hero("Banana Guard", 3, ""); // Check
    
    
    protected static Hashtable<String, Hero> ALL_HEROES;
    
    static {
        ALL_HEROES = new Hashtable<String, Hero>();
        ALL_HEROES.put(JAKE.getName(), JAKE);
        ALL_HEROES.put(FINN.getName(), FINN);
        ALL_HEROES.put(BMO.getName(), BMO);
        ALL_HEROES.put(MARCELINE.getName(), MARCELINE);
        ALL_HEROES.put(PRINCESS_BUBBLEGUM.getName(), PRINCESS_BUBBLEGUM);
        ALL_HEROES.put(FLAME_PRINCESS.getName(), FLAME_PRINCESS);
        ALL_HEROES.put(LADY_RAINICORN.getName(), LADY_RAINICORN);
        ALL_HEROES.put(LUMPY_SPACE_PRINCESS.getName(), LUMPY_SPACE_PRINCESS);
        ALL_HEROES.put(ASH.getName(), ASH);
        ALL_HEROES.put(RICARDIO.getName(), RICARDIO);
        ALL_HEROES.put(DR_DONUT.getName(), DR_DONUT);
    }
    
    public static List<Hero> getAllHeroes() {
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.addAll(ALL_HEROES.values());
        return heroes;
    }
    
    public static Hero getHero(String name) {
        return ALL_HEROES.get(name);
    }
    
    protected String mName;
    protected String mAbility;
    protected int mAbilityPeriod;
    
    protected Hero(String name, int abilityPeriod, String ability) {
        mName = name;
        mAbilityPeriod = abilityPeriod;
        mAbility = ability;
    }

    public String getAbility() {
        return mAbility;
    }

    public int getAbilityPeriod() {
        return mAbilityPeriod;
    }

    public String getName() {
        return mName;
    }

}
