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
package com.kevinquan.cwa.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.kevinquan.cwa.Blueprints;
import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.creatures.Creature;
import com.kevinquan.cwa.model.recipes.Recipe;
import com.kevinquan.cwa.model.recipes.Recipe.Ingredient;
import com.kevinquan.cwa.model.recipes.RecipeStore;
import com.kevinquan.java.utils.JSONUtils;
import com.kevinquan.tests.BaseJUnit4Test;

public class RecipesTestCase extends BaseJUnit4Test {

    @SuppressWarnings("unused")
    private static final String TAG = RecipesTestCase.class.getSimpleName();
    
    protected static String[] CARD_NAMES = new String[] { Blueprints.FIELD_RECIPE_CARD1, Blueprints.FIELD_RECIPE_CARD2, Blueprints.FIELD_RECIPE_CARD3, Blueprints.FIELD_RECIPE_CARD4, Blueprints.FIELD_RECIPE_CARD5 };
    protected static String[] CARD_COUNTS = new String[] { Blueprints.FIELD_RECIPE_CARD1_COUNT, Blueprints.FIELD_RECIPE_CARD2_COUNT, Blueprints.FIELD_RECIPE_CARD3_COUNT, Blueprints.FIELD_RECIPE_CARD4_COUNT, Blueprints.FIELD_RECIPE_CARD5_COUNT };
    
    protected JSONArray mBlueprint; 
    protected RecipeStore mRecipeStore;
    
    @Override
    public void setUp() {
        super.setUp();
        mBlueprint = readBlueprint(Blueprints.RECIPES);
        mRecipeStore = RecipeStore.getInstance();
    }
    
    @Test
    public void testRecipesBlueprint() {
        // There is an invalid ChestBurster recipe
        assertThat("Incorrect recipe count", mBlueprint.length()-1, is(mRecipeStore.getCount()));
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject recipe = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String resultName = JSONUtils.safeGetString(recipe, Blueprints.FIELD_RESULT_CARD);
            Card resultCard = mNameTranslater.getCardByName(resultName);
            if (resultCard == null) {
                // Temporary.  This should fail later once all recipes are added
                System.out.println("No known card for result "+resultName);
                continue;
            }
            String costAsString = JSONUtils.safeGetString(recipe, Blueprints.FIELD_COST);
            if (costAsString == null || costAsString.trim().isEmpty()) {
                System.err.println("Could not retrieve cost from: "+recipe);
                continue;
            }
            int cost = JSONUtils.safeGetInt(recipe, Blueprints.FIELD_COST, -1);
            List<Recipe> forgeRecipes = mRecipeStore.getRecipeThatCreates(resultCard);
            if (forgeRecipes == null || forgeRecipes.isEmpty()) {
                fail("Could not find recipe for "+resultCard.getName());
            }
            Recipe forgeRecipe = forgeRecipes.get(0);
            assertThat("Incorrect cost to forge "+resultCard.getName(), cost, is(forgeRecipe.getCost()));
            
            List<Ingredient> expectedIngredients = forgeRecipe.getIngredients();
            int j = 0;
            for (j = 0; j < CARD_NAMES.length; j++) {
                String ingredientName = JSONUtils.safeGetString(recipe, CARD_NAMES[j]);
                if (ingredientName == null || ingredientName.trim().isEmpty()) {
                    // No more ingredients, says the blueprint
                    break;
                }
                Card ingredient = mNameTranslater.getCardByName(ingredientName);
                if (ingredient == null) {
                    fail("Could not translate ingredient with name "+ingredientName);
                }
                // There is a bug in the blueprint where sometimes the card name is present but the count is not.  In this case, 1 is assumed.
                String ingredientNumberTest = JSONUtils.safeGetString(recipe, CARD_COUNTS[j]);
                int ingredientNumber = 1;
                if (ingredientNumberTest != null && !ingredientNumberTest.trim().isEmpty()) {
                    ingredientNumber = JSONUtils.safeGetInt(recipe, CARD_COUNTS[j], -1);
                }
                assertThat("Incorrect "+j+"th card to create "+resultCard.getName(), ingredient.getId(), is(expectedIngredients.get(j).getCard().getId()));
                assertThat("Incorrect "+j+"th card count to create "+resultCard.getName(), ingredientNumber, is(expectedIngredients.get(j).getCardCount()));
            }
            // We already increment j to catch the break case
            assertThat("Incorrect number of ingredients to create "+resultCard.getName(), j, is(expectedIngredients.size()));
        }
        
    }
    
    public void generateRecipesCode() {
        for (int i = 0; i < mBlueprint.length(); i++) {
            JSONObject recipe = JSONUtils.safeGetJSONObjectFromArray(mBlueprint, i);
            String resultName = JSONUtils.safeGetString(recipe, Blueprints.FIELD_RESULT_CARD);
            Card resultCard = mNameTranslater.getCardByName(resultName);
            if (resultCard == null) {
                // Temporary.  This should fail later once all recipes are added
                System.out.println("No known card for result "+resultName);
                continue;
            }
            String costAsString = JSONUtils.safeGetString(recipe, Blueprints.FIELD_COST);
            if (costAsString == null || costAsString.trim().isEmpty()) {
                System.err.println("Could not retrieve cost from: "+recipe);
                continue;
            }
            int cost = JSONUtils.safeGetInt(recipe, Blueprints.FIELD_COST, -1);
            System.out.print("addRecipe(new Recipe("+cost+", new "+resultCard.getClass().getSimpleName()+"()");
            if (resultCard instanceof Creature && ((Creature)resultCard).isGold()) {
                System.out.print(".setGold(true)");
            }
            System.out.print(")");
            
            int j = 0;
            for (j = 0; j < CARD_NAMES.length; j++) {
                String ingredientName = JSONUtils.safeGetString(recipe, CARD_NAMES[j]);
                if (ingredientName == null || ingredientName.trim().isEmpty()) {
                    // No more ingredients, says the blueprint
                    break;
                }
                Card ingredient = mNameTranslater.getCardByName(ingredientName);
                if (ingredient == null) {
                    fail("Could not translate ingredient with name "+ingredientName);
                }
                // There is a bug in the blueprint where sometimes the card name is present but the count is not.  In this case, 1 is assumed.
                String ingredientNumberTest = JSONUtils.safeGetString(recipe, CARD_COUNTS[j]);
                int ingredientNumber = 1;
                if (ingredientNumberTest != null && !ingredientNumberTest.trim().isEmpty()) {
                    ingredientNumber = JSONUtils.safeGetInt(recipe, CARD_COUNTS[j], -1);
                }
                System.out.println();
                System.out.print("\t\t\t.addIngredient(new "+ingredient.getClass().getSimpleName()+"()");
                if (ingredient instanceof Creature && ((Creature)ingredient).isGold()) {
                    System.out.print(".setGold(true)");
                }
                if (ingredientNumber == 1) {
                    System.out.print(")");
                } else {
                    System.out.print(", "+ingredientNumber+")");
                }
            }
            System.out.println(");");            
        }
        
    }

}
