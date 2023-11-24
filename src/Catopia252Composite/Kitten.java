/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Composite;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Kitten implements Cat{
    
    
     private int catId;
    private String ownerId;
    private String catName;
    private String sex;
    private int age;
    private String breed;
    private SingleCat bound;
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

    public Kitten(int catId, String ownerId, String catName, String sex, int age, String breed, SingleCat bound, String behavior, boolean disabled, String medicalHistory, boolean likesCats, boolean likesChildrens, String adoptionState, String adoptionReason, ArrayList<String> adoptionUpdates, int adoptionFees) {
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



    Kitten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public int getCatId() {
        return catId;
    }

     @Override
    public void setCatId(int catId) {
        this.catId = catId;
    }

     @Override
    public String getOwnerId() {
        return ownerId;
    }

     @Override
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

     @Override
    public String getCatName() {
        return catName;
    }

     @Override
    public void setCatName(String catName) {
        this.catName = catName;
    }

     @Override
    public String getSex() {
        return sex;
    }

     @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

     @Override
    public int getAge() {
        return age;
    }

     @Override
    public void setAge(int age) {
        this.age = age;
    }

     @Override
    public String getBreed() {
        return breed;
    }

     @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

     @Override
    public SingleCat getBound() {
        return bound;
    }

     @Override
    public void setBound(SingleCat bound) {
        this.bound = bound;
    }

     @Override
    public String getBehavior() {
        return behavior;
    }

     @Override
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

     @Override
    public boolean isDisabled() {
        return disabled;
    }

     @Override
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

     @Override
    public String getMedicalHistory() {
        return medicalHistory;
    }

     @Override
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

     @Override
    public boolean isLikesCats() {
        return likesCats;
    }

     @Override
    public void setLikesCats(boolean likesCats) {
        this.likesCats = likesCats;
    }

     @Override
    public boolean isLikesChildrens() {
        return likesChildrens;
    }

     @Override
    public void setLikesChildrens(boolean likesChildrens) {
        this.likesChildrens = likesChildrens;
    }

     @Override
    public String getAdoptionState() {
        return adoptionState;
    }

     @Override
    public void setAdoptionState(String adoptionState) {
        this.adoptionState = adoptionState;
    }

     @Override
    public String getAdoptionReason() {
        return adoptionReason;
    }

     @Override
    public void setAdoptionReason(String adoptionReason) {
        this.adoptionReason = adoptionReason;
    }

     @Override
    public ArrayList getAdoptionUpdates() {
        return adoptionUpdates;
    }

     @Override
   public void setAdoptionUpdates(ArrayList adoptionUpdates) {
        this.adoptionUpdates = adoptionUpdates;
    }

     @Override
    public int getAdoptionFees() {
        return adoptionFees;
    }

     @Override
    public void setAdoptionFees(int adoptionFees) {
        this.adoptionFees = adoptionFees;
    }  
           // A method to search for cat’s bound by its name :
    
     @Override
    public SingleCat Searchbound(String boundName,ArrayList<SingleCat> cats){
        SingleCat boundCat = null ;
        for(SingleCat cat:cats){
            if(cat.getCatName().equalsIgnoreCase(boundName)){
               boundCat = cat ;
            }
        }
        return boundCat;
    }
      
    // A method to add a new cat to the database ( arraylist ) : 
     @Override
      public void addNewCattoDatabase(SingleCat cat,ArrayList<SingleCat> cats){
        cats.add(cat) ;
      }
     @Override
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



