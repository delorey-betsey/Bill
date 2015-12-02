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
public class DarkAlley implements Serializable{
    
    //class-instance variables
    private Number locationId;
    private String locationText;
    private String itemTaxCode;

    public DarkAlley() {
    }

    
    public Number getLocationId() {
        return locationId;
    }

    public void setLocationId(Number locationId) {
        this.locationId = locationId;
    }

    public String getLocationText() {
        return locationText;
    }

    public void setLocationText(String locationText) {
        this.locationText = locationText;
    }

    public String getItemTaxCode() {
        return itemTaxCode;
    }

    public void setItemTaxCode(String itemTaxCode) {
        this.itemTaxCode = itemTaxCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.locationId);
        hash = 47 * hash + Objects.hashCode(this.locationText);
        hash = 47 * hash + Objects.hashCode(this.itemTaxCode);
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
        final DarkAlley other = (DarkAlley) obj;
        if (!Objects.equals(this.locationId, other.locationId)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.itemTaxCode, other.itemTaxCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DarkAlley{" + "locationId=" + locationId + ", locationText=" + locationText + ", itemTaxCode=" + itemTaxCode + '}';
    }
            
    
}
