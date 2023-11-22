package cattopia;


import java.util.ArrayList;


public class Individual extends User{
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
