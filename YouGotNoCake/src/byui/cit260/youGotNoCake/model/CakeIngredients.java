package byui.cit260.youGotNoCake.model;

import java.io.Serializable;

public class CakeIngredients implements Serializable{
    //class-instance variables
    private String itemFlour;
    private String itemSugar;
    private String itemButta;
    private String itemBananas;
    private String[] cakeIngredientsArray;

    public CakeIngredients() {
        itemFlour = "Flour";
        itemSugar = "Sugar";
        itemButta = "Butta";
        itemBananas = "Bananas";
        cakeIngredientsArray = new String[]{this.itemBananas, this.itemButta, this.itemFlour, this.itemSugar};
    }

    public String[] getCakeIngredientsArray() {
        return cakeIngredientsArray;
    }
 
    public String getItemFlour() {
        return itemFlour;
    }

    public void setItemFlour(String itemFlour) {
        this.itemFlour = itemFlour;
    }
    
    public String getItemSugar() {
        return itemSugar;
    }
    
    public void setItemSugar(String itemSugar) {
    this.itemSugar = itemSugar;
    }

    public String getItemButta() {
        return itemButta;
    }
    
    public void setItemButta(String itemButta) {
    this.itemButta = itemButta;
    }

    public String getItemBananas() {
        return itemBananas;
    }
    
    public void setItemBananas(String itemBananas) {
    this.itemBananas = itemBananas;
    }
}

//    @Override
//    public String toString() {
//        return "CakeIngredients{" + "itemFlour=" + itemFlour + ", itemSugar=" + itemSugar + ", itemButta=" + itemButta + ", itemBananas=" + itemBananas + '}';
//    }
//
//        @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 47 * hash + Objects.hashCode(this.itemFlour);
//        hash = 47 * hash + Objects.hashCode(this.itemSugar);
//        hash = 47 * hash + Objects.hashCode(this.itemButta);
//        hash = 47 * hash + Objects.hashCode(this.itemBananas);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final CakeIngredients other = (CakeIngredients) obj;
//        if (!Objects.equals(this.itemFlour, other.itemFlour)) {
//            return false;
//        }
//        if (!Objects.equals(this.itemSugar, other.itemSugar)) {
//            return false;
//        }
//        if (!Objects.equals(this.itemButta, other.itemButta)) {
//            return false;
//        }
//        return true;
//    }
    
    
    

