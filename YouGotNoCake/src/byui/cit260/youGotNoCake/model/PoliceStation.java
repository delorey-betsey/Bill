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
public class PoliceStation implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String itemWharmMilk;

    public PoliceStation() {
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

    public String getItemWharmMilk() {
        return itemWharmMilk;
    }

    public void setItemWharmMilk(String itemWharmMilk) {
        this.itemWharmMilk = itemWharmMilk;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.locationID);
        hash = 97 * hash + Objects.hashCode(this.locationText);
        hash = 97 * hash + Objects.hashCode(this.itemWharmMilk);
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
        final PoliceStation other = (PoliceStation) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemWharmMilk, other.itemWharmMilk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PoliceStation{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemWharmMilk=" + itemWharmMilk + '}';
    }
    
    
}
