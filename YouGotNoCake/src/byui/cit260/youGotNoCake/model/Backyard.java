/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Backyard implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private String foundItem;

    public Backyard(Player player) {
        this.mmvPlayer = player;
        this.locationID = 2;
        this.foundItem = "Tranquilizer Dart";
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public Player pickupItem() {
        for (String cakeIngredient : new CakeIngredients().getCakeIngredientsArray()) {
            if (cakeIngredient.equalsIgnoreCase(foundItem)) {
                mmvPlayer.getFoundCakeIngredients().add(foundItem);
            }
        }
        for (String partySupply : new PartySupplies().getPartySuppliesArray()) {
            if (partySupply.equalsIgnoreCase(foundItem)) {
                mmvPlayer.getFoundPartySupplies().add(foundItem);
            }
        }
        for (String sleepAid : new SleepAids().getSleepAidsArray()) {
            if (sleepAid.equals(foundItem)) {
                mmvPlayer.getFoundSleepAids().add(foundItem);
            }
        }
        return mmvPlayer;
    }
            
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.locationID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Backyard other = (Backyard) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Backyard{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}
