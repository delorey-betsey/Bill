/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;

/**
 *
 * @author Betsey
 */
public class CakeIngredientsListView {
    
    public enum Ingredient {
        flour,
        sugar,
        butta,
        bananas;        
    }
    
    public static CakeIngredient[] createIngredientList() {
        //created array(list) of cake ingredients
        CakeIngredient[] ingredients = 
                new CakeIngredient[Constants.NUMBER_OF_INGREDIENTS_FOUND]; 
        
        CakeIngredient flour = new CakeIngredient();
        flour.setFoundFlag(false);
        ingredients[ingredient.flour.ordinal()] = flour;
        
        CakeIngredient sugar = new CakeIngredient();
        sugar.setFoundFlag(false);
        ingredients[ingredient.sugar.ordinal()] = sugar;
        
        CakeIngredient butta = new CakeIngredient();
        butta.setFoundFlag(false);
        ingredients[ingredient.butta.ordinal()] = butta;
        
        CakeIngredient bananas = new CakeIngredient();
        bananas.setFoundFlag(false);
        ingredients[ingredient.bananas.ordinal()] = bananas;    
    }
    
    public void doAction(char selection)  {
        switch (selection) {
            case 'C': //"Cross off list", ie-flip found flag
                this.checkIngredientOffList();
                this.displayIngredientsConfirmMsg();
                break;
            case 'S': //Display number of ingredients found
                this.sortFoundIngredients();
                this.displayIngredientsListStatus();
                break;
        }
    }
    
    private void checkIngredientOffList() {
        System.out.println("***checkIngredientOffList stub function called--adds asterisk***");
    }
    private void displayIngredientsConfirmMsg() {
        System.out.println("***displayIngredientsConfirmMsg stub function called--confirming item crossed off ingredients list***");
    }
    
    private void sortFoundIngredients() {
        System.out.println("***displayIngredientsConfirmMsg stub function called--confirming item crossed off ingredients list***");
    }
    private void displayIngredientsListStatus() {
        System.out.println("***displayIngredientsListStatus stub function called--confirming number of ingredients found***");
    }
    
    
    
    
}





















