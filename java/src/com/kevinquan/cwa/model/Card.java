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
        Cool(1),
        Nice(2),
        Rare(3),
        VeryRare(4),
        AlgebraicRare(5),
        ;
        
        public static final String STAR = "\u2605";
        
        protected int mNumberOfStars;
        
        private Rarity(int stars) {
            mNumberOfStars = stars;
        }
        
        public int getStarsCount() {
            return mNumberOfStars;
        }
        
        public String getStars() {
            String stars = STAR;
            for (int i = 1; i < mNumberOfStars; i++) { 
                stars += STAR;
            }
            return stars;
        }
    }

    String getId();
    String getName();
    String getDescription();
    
    int getCost();
    Faction getFaction();
    Rarity getRarity();
   
}
