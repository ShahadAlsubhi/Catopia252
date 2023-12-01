/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;

import java.util.ArrayList;


public class Individual extends user{
    private boolean hasCat;
    private boolean hasChildren;
    
    

    public Individual(boolean hasCat, boolean hasChildren, String UserID, String Name, String Location, String ContactInfo, ArrayList<String> OwenedCats, ArrayList<String> DonateTo) {
        super(UserID, Name, Location, ContactInfo, OwenedCats, DonateTo);
        this.hasCat = hasCat;
        this.hasChildren = hasChildren;
    }

    public Individual() {
    }

    
    
    public boolean isHasCat() {
        return hasCat;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasCat(boolean hasCat) {
        this.hasCat = hasCat;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
    

}
