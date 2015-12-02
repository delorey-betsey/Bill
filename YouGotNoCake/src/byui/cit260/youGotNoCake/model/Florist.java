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
public class Florist implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String itemFlour;

    public Florist() {
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

    public String getItemFlour() {
        return itemFlour;
    }

    public void setItemFlour(String itemFlour) {
        this.itemFlour = itemFlour;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.locationID);
        hash = 79 * hash + Objects.hashCode(this.locationText);
        hash = 79 * hash + Objects.hashCode(this.itemFlour);
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
        final Florist other = (Florist) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemFlour, other.itemFlour)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Florist{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemFlour=" + itemFlour + '}';
    }
    
    
}
