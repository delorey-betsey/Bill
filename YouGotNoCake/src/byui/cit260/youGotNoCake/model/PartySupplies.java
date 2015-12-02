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
public class PartySupplies implements Serializable{
    //class-instance variables
    private String itemWhoopie;
    private String itemSpumoni;
    private String itemGrimReaper;
    private String itemPlasticFork;

    public PartySupplies() {
    }
    
    

    public String getItemWhoopie() {
        return itemWhoopie;
    }

    public void setItemWhoopie(String itemWhoopie) {
        this.itemWhoopie = itemWhoopie;
    }

    public String getItemSpumoni() {
        return itemSpumoni;
    }

    public void setItemSpumoni(String itemSpumoni) {
        this.itemSpumoni = itemSpumoni;
    }

    public String getItemGrimReaper() {
        return itemGrimReaper;
    }

    public void setItemGrimReaper(String itemGrimReaper) {
        this.itemGrimReaper = itemGrimReaper;
    }

    public String getItemPlasticFork() {
        return itemPlasticFork;
    }

    public void setItemPlasticFork(String itemPlasticFork) {
        this.itemPlasticFork = itemPlasticFork;
    }

    @Override
    public String toString() {
        return "PartySupplies{" + "itemWhoopie=" + itemWhoopie + ", itemSpumoni=" + itemSpumoni + ", itemGrimReaper=" + itemGrimReaper + ", itemPlasticFork=" + itemPlasticFork + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.itemWhoopie);
        hash = 37 * hash + Objects.hashCode(this.itemSpumoni);
        hash = 37 * hash + Objects.hashCode(this.itemGrimReaper);
        hash = 37 * hash + Objects.hashCode(this.itemPlasticFork);
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
        final PartySupplies other = (PartySupplies) obj;
        if (!Objects.equals(this.itemWhoopie, other.itemWhoopie)) {
            return false;
        }
        if (!Objects.equals(this.itemSpumoni, other.itemSpumoni)) {
            return false;
        }
        if (!Objects.equals(this.itemGrimReaper, other.itemGrimReaper)) {
            return false;
        }
        if (!Objects.equals(this.itemPlasticFork, other.itemPlasticFork)) {
            return false;
        }
        return true;
    }
    
    
    
}
