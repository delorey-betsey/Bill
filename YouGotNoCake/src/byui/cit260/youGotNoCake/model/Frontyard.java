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
public class Frontyard implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String itemBananas;

    public Frontyard() {
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

    public String getItemBananas() {
        return itemBananas;
    }

    public void setItemBananas(String itemBananas) {
        this.itemBananas = itemBananas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.locationID);
        hash = 97 * hash + Objects.hashCode(this.locationText);
        hash = 97 * hash + Objects.hashCode(this.itemBananas);
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
        final Frontyard other = (Frontyard) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemBananas, other.itemBananas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Frontyard{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemBananas=" + itemBananas + '}';
    }
    
    
}
