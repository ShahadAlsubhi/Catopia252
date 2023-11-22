
package cattopia;
import java.util.*;

public class Cat {
    
    private int catId;
    private String ownerId;
    private String catName;
    private String sex;
    private int age;
    private String breed;
    private Cat bound;
    private String behavior;
    private boolean disabled;
    private String medicalHistory;
    private boolean likesCats;
    private boolean likesChildrens;
    private String adoptionState;
    private String adoptionReason;
    private ArrayList<String> adoptionUpdates;  
    private int adoptionFees;
   // public static ArrayList<Cat> cats;

    public Cat(int catId, String ownerId, String catName, String sex, int age, String breed, Cat bound, String behavior, boolean disabled, String medicalHistory, boolean likesCats, boolean likesChildrens, String adoptionState, String adoptionReason, ArrayList<String> adoptionUpdates, int adoptionFees) {
        this.catId = catId;
        this.ownerId = ownerId;
        this.catName = catName;
        this.sex = sex;
        this.age = age;
        this.breed = breed;
        this.bound = bound;
        this.behavior = behavior;
        this.disabled = disabled;
        this.medicalHistory = medicalHistory;
        this.likesCats = likesCats;
        this.likesChildrens = likesChildrens;
        this.adoptionState = adoptionState;
        this.adoptionReason = adoptionReason;
        this.adoptionUpdates = adoptionUpdates;
        this.adoptionFees = adoptionFees;
    }



    Cat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat getBound() {
        return bound;
    }

    public void setBound(Cat bound) {
        this.bound = bound;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public boolean isLikesCats() {
        return likesCats;
    }

    public void setLikesCats(boolean likesCats) {
        this.likesCats = likesCats;
    }

    public boolean isLikesChildrens() {
        return likesChildrens;
    }

    public void setLikesChildrens(boolean likesChildrens) {
        this.likesChildrens = likesChildrens;
    }

    public String getAdoptionState() {
        return adoptionState;
    }

    public void setAdoptionState(String adoptionState) {
        this.adoptionState = adoptionState;
    }

    public String getAdoptionReason() {
        return adoptionReason;
    }

    public void setAdoptionReason(String adoptionReason) {
        this.adoptionReason = adoptionReason;
    }

    public ArrayList getAdoptionUpdates() {
        return adoptionUpdates;
    }

   public void setAdoptionUpdates(ArrayList adoptionUpdates) {
        this.adoptionUpdates = adoptionUpdates;
    }

    public int getAdoptionFees() {
        return adoptionFees;
    }

    public void setAdoptionFees(int adoptionFees) {
        this.adoptionFees = adoptionFees;
    }
    
    // filter function start
    
    public static ArrayList<Cat> FilterByBreed(String breed,ArrayList<Cat> cats){
        ArrayList Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getBreed().equalsIgnoreCase(breed)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterByAge(int age,ArrayList<Cat> cats){
        ArrayList Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getAge()==age){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterByGender(String gender,ArrayList<Cat> cats){
        ArrayList<Cat> Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getSex().equalsIgnoreCase(gender)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterByBehavior(String behavior,ArrayList<Cat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getBehavior().equalsIgnoreCase(behavior)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterDisabled(ArrayList<Cat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).isDisabled()==true){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterLikesChildren(ArrayList<Cat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).isLikesChildrens()==true){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<Cat> FilterLikesCats(ArrayList<Cat> cats){
         ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).isLikesCats()==true){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }

    // filter function end 
    
           // A method to search for cat’s bound by its name :
    
    public Cat Searchbound(String boundName,ArrayList<Cat> cats){
        Cat boundCat = null ;
        for(Cat cat:cats){
            if(cat.getCatName().equalsIgnoreCase(boundName)){
               boundCat = cat ;
            }
        }
        return boundCat;
    }
      
    // A method to add a new cat to the database ( arraylist ) : 
      public void addNewCattoDatabase(Cat cat,ArrayList<Cat> cats){
        cats.add(cat) ;
      }
       public String toString() {
           return "ID : "+catId+" cat name :"+catName+" gender : "+sex+" age : "
                   +age+"\n breed : "+breed+" bound : "+bound+" behavior : "+
                   behavior+"\n disabled : "+disabled+" medical history : "+
                   medicalHistory+"\n likes cats : "+likesCats+" likes childrend :"
                   +likesChildrens+"\n adoption state : "+adoptionState+
                   "\n adoption reason : "+adoptionReason+" adoption fees : "+
                   adoptionFees;
       }
}
