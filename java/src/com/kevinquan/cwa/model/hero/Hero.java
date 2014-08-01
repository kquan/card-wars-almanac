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
    
    public static final Hero JAKE = new Hero("Jake", 3, "All your corn creatures gain +3 Attack").setBackgroundColor(0xFF6BDFFF);
    public static final Hero FINN = new Hero("Finn", 5, "Gain 2 extra Magic Points for 1 turn").setBackgroundColor(0xFFB5DB31);
    public static final Hero BMO = new Hero("BMO", 3, "Gain 2 extra Magic Points for 1 turn").setBackgroundColor(0xFF006600);
    public static final Hero MARCELINE = new Hero("Marceline", 3, "All of your creatures gain +2 Attack").setBackgroundColor(0xFF8311B5);
    public static final Hero PRINCESS_BUBBLEGUM = new Hero("Princess Bubblegum", 4, "Fully heal all of your creatures").setBackgroundColor(0xFFBD45CE);
    public static final Hero FLAME_PRINCESS = new Hero("Flame Princess", 4, "Draw 2 cards").setBackgroundColor(0xFF880000);
    public static final Hero LADY_RAINICORN = new Hero("Lady Rainicorn", 3, "Choose a creature and fully heal it").setBackgroundColor(0xFF00CA6B);
    public static final Hero LUMPY_SPACE_PRINCESS = new Hero("Lumpy Space Princess", 3, "Fully heal all of your Plains creatures").setBackgroundColor(0xFFFFDD77);
    public static final Hero ASH = new Hero("Ash", 4, "Return any card from the Discard Pile back to your hand").setBackgroundColor(0xFF553266);
    public static final Hero RICARDIO = new Hero("Ricardio", 3, "Draw 1 card").setBackgroundColor(0xFF770000);
    public static final Hero DR_DONUT = new Hero("Dr Donut", 5, "Return any Creature from the Discard Pile back to your hand").setBackgroundColor(0xFF5A9A21);
    public static final Hero EARL_OF_LEMONGRAB = new Hero("Earl of Lemongrab", 3, "All creatures summoned this turn cost 1 less Magic Point").setBackgroundColor(0xFF339945);
    public static final Hero HUNSON_ABADEER = new Hero("Hunson Abadeer", 4, "All cards cast this turn cost 1 less magic point").setBackgroundColor(0xFF009866);
    public static final Hero ICE_KING = new Hero("Ice King", 4, "Send all of your opponent's Buildings back to their hand");
    public static final Hero GUNTER = new Hero("Gunter", 3, "Return any Spell card from the Discard Pile to your hand");
    public static final Hero FINN_DOCTOR = new Hero("Doctor Finn", 3, "All Spells cast this turn cost 1 less Magic Point").setBackgroundColor(0xFFA5AACE);
    public static final Hero FINN_PAJAMA = new Hero("Pajama Finn", 3, "All your Universal creatures gain +4 Defense").setBackgroundColor(0xFF21355A);
    public static final Hero MAGIC_MAN = new Hero("Magic Man", 2, "Gain 1 extra Magic Point this turn");
    public static final Hero PEPPERMINT_BUTLER = new Hero("Peppermint Butler", 2, "Return any Building card from the Discard Pile to your hand");
    public static final Hero CINAMON_BUNN = new Hero("Cinamon Bunn", 3, "All your Nicelands creatures gain +3 Attack");
    public static final Hero BANANA_GUARD = new Hero("Banana Guard", 3, "All your creatures gain +3 Defense");
    
    
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
        ALL_HEROES.put(EARL_OF_LEMONGRAB.getName(), EARL_OF_LEMONGRAB);
        
        ALL_HEROES.put(GUNTER.getName(), GUNTER);
        ALL_HEROES.put(ICE_KING.getName(), ICE_KING);
        ALL_HEROES.put(HUNSON_ABADEER.getName(), HUNSON_ABADEER);
        ALL_HEROES.put(FINN_DOCTOR.getName(), FINN_DOCTOR);
        ALL_HEROES.put(FINN_PAJAMA.getName(), FINN_PAJAMA);
        ALL_HEROES.put(MAGIC_MAN.getName(), MAGIC_MAN);
        ALL_HEROES.put(PEPPERMINT_BUTLER.getName(), PEPPERMINT_BUTLER);
        ALL_HEROES.put(CINAMON_BUNN.getName(), CINAMON_BUNN);
        ALL_HEROES.put(BANANA_GUARD.getName(), BANANA_GUARD);
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
    protected int mBackgroundColor;
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

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    public String getName() {
        return mName;
    }

    public Hero setBackgroundColor(int backgroundColor) {
        mBackgroundColor = backgroundColor;
        return this;
    }

}
