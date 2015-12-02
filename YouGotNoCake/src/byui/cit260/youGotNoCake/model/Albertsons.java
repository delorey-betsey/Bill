/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Alyse
 */
public class Albertsons implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String itemSpumoni;

    public Albertsons() {
    }
    
    
    
    public Number getLocationID() {
        return locationID;
    }

    public void setLocationID(Number locationID) {
        this.locationID = locationID;
    }

    public String getLocationText() {
        return locationText;
    }

    public void setLocationText(String locationText) {
        this.locationText = locationText;
    }

    public String getItemSpumoni() {
        return itemSpumoni;
    }

    public void setItemSpumoni(String itemSpumoni) {
        this.itemSpumoni = itemSpumoni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.locationID);
        hash = 43 * hash + Objects.hashCode(this.locationText);
        hash = 43 * hash + Objects.hashCode(this.itemSpumoni);
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
        final Albertsons other = (Albertsons) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemSpumoni, other.itemSpumoni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Albertsons{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemSpumoni=" + itemSpumoni + '}';
    }

    
   
    
}
