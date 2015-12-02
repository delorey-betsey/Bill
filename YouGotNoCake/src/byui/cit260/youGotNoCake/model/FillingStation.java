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
public class FillingStation implements Serializable{
    
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String itemSugar;

    public FillingStation() {
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

    public String getItemSugar() {
        return itemSugar;
    }

    public void setItemSugar(String itemSugar) {
        this.itemSugar = itemSugar;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.locationID);
        hash = 71 * hash + Objects.hashCode(this.locationText);
        hash = 71 * hash + Objects.hashCode(this.itemSugar);
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
        final FillingStation other = (FillingStation) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemSugar, other.itemSugar)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FillingStation{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemSugar=" + itemSugar + '}';
    }
    
    
}
