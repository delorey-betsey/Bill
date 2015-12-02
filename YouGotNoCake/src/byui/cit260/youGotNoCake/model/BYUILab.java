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
public class BYUILab implements Serializable{
    
    //class instance variables
    private Number locationID;
    private String locationText;
    private String itemGrimReaper;

    public BYUILab() {
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

    public String getItemGrimReaper() {
        return itemGrimReaper;
    }

    public void setItemGrimReaper(String itemGrimReaper) {
        this.itemGrimReaper = itemGrimReaper;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.locationID);
        hash = 41 * hash + Objects.hashCode(this.locationText);
        hash = 41 * hash + Objects.hashCode(this.itemGrimReaper);
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
        final BYUILab other = (BYUILab) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemGrimReaper, other.itemGrimReaper)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BYUILab{" + "locationID=" + locationID + ", locationText=" + locationText + ", itemGrimReaper=" + itemGrimReaper + '}';
    }
    
    
    
}
