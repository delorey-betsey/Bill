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
 * @author Betsey
 */
public class SleepAids implements Serializable{
    //class-instance variables
    private String itemApneaFairy;
    private String itemTranquilDart;
    private String itemTaxCode;
    private String itemWarmMilk;

    public SleepAids() {
    }
    
        public String getItemApneaFairy() {
        return itemApneaFairy;
    }

    public void setItemApneaFairy(String itemApneaFairy) {
        this.itemApneaFairy = itemApneaFairy;
    }

    public String getItemTranquilDart() {
        return itemTranquilDart;
    }

    public void setItemTranquilDart(String itemTranquilDart) {
        this.itemTranquilDart = itemTranquilDart;
    }

    public String getItemTaxCode() {
        return itemTaxCode;
    }

    public void setItemTaxCode(String itemTaxCode) {
        this.itemTaxCode = itemTaxCode;
    }

    public String getItemWarmMilk() {
        return itemWarmMilk;
    }

    public void setItemWarmMilk(String itemWarmMilk) {
        this.itemWarmMilk = itemWarmMilk;
    }

    @Override
    public String toString() {
        return "SleepAids{" + "itemApneaFairy=" + itemApneaFairy + ", itemTranquilDart=" + itemTranquilDart + ", itemTaxCode=" + itemTaxCode + ", itemWarmMilk=" + itemWarmMilk + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.itemApneaFairy);
        hash = 41 * hash + Objects.hashCode(this.itemTranquilDart);
        hash = 41 * hash + Objects.hashCode(this.itemTaxCode);
        hash = 41 * hash + Objects.hashCode(this.itemWarmMilk);
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
        final SleepAids other = (SleepAids) obj;
        if (!Objects.equals(this.itemApneaFairy, other.itemApneaFairy)) {
            return false;
        }
        if (!Objects.equals(this.itemTranquilDart, other.itemTranquilDart)) {
            return false;
        }
        if (!Objects.equals(this.itemTaxCode, other.itemTaxCode)) {
            return false;
        }
        if (!Objects.equals(this.itemWarmMilk, other.itemWarmMilk)) {
            return false;
        }
        return true;
    }
    
    
    
}
