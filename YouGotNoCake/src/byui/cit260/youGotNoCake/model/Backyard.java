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
public class Backyard implements Serializable {
    
     //class-instance variables
    private Number locationID;
    private String licationText;

    public Backyard() {
    }

    
    public Number getLocationID() {
        return locationID;
    }

    public void setLocationID(Number locationID) {
        this.locationID = locationID;
    }

    public String getLicationText() {
        return licationText;
    }

    public void setLicationText(String licationText) {
        this.licationText = licationText;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.locationID);
        hash = 73 * hash + Objects.hashCode(this.licationText);
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
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.licationText, other.licationText)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Backyard{" + "locationID=" + locationID + ", licationText=" + licationText + '}';
    }
    
    
}
