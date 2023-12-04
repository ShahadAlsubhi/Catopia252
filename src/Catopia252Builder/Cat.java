/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Builder;

import java.util.ArrayList;

public class Cat {
    // Attributes
    private String catID;
    private String name;
    private char sex;
    private int age;
    private String breed;
    private String ownerID;
    private Cat bonded;
    private String behavior;
    private boolean disabled;
    private String medicalHistory;
    private boolean likesCats;
    private boolean likesChildren;
    private String adoptionState;
    private String adoptionReason;
    private ArrayList<String> adoptionUpdates;
    private int adoptionFees;

    // Private constructor to enforce the use of the builder
    private Cat() {
        // Private constructor
    }
    public interface CatBuilder {
    CatBuilder sex(char sex);
    CatBuilder age(int age);
    CatBuilder setCatId(int catId);
    CatBuilder setOwnerId(String ownerId);
    CatBuilder setCatName(String catName);
    CatBuilder setSex(String sex);
    CatBuilder setAge(int age);
    CatBuilder breed(String breed);
    CatBuilder ownerID(String ownerId);
    CatBuilder bonded(Cat objectBound);
    CatBuilder setBreed(String breed);
    CatBuilder setBound(Cat bound);
    CatBuilder setBehavior(String behavior);
    CatBuilder setDisabled(Boolean disabled);
    CatBuilder setMedicalHistory(String medicalHistory);
    CatBuilder setLikesCats(Boolean likesCats);
    CatBuilder setLikesChildrens(Boolean likesChildrens);
    CatBuilder setAdoptionState(String adoptionState);
    CatBuilder setAdoptionReason(String adoptionReason);
    CatBuilder setAdoptionUpdates(ArrayList<String> adoptionUpdates);
    CatBuilder setAdoptionFees(int adoptionFees);
        // Method to build the CatProfile object
    Cat build();

} 
    // Getter methods for Cat attributes
    public String getCatID() {
        return catID;
    }
     public void setCatID(String catId) {
        this.catID = catId;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String catName) {
        this.name = catName;
    }
    

    public char getSex() {
        return sex;
    }
    
    public void setSex(char sex) {
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

    public String getOwnerID() {
        return ownerID;
    }
 public void setOwnerId(String ownerId) {
        this.ownerID = ownerId;
    }

    public Cat getBonded() {
        return bonded;
    }
    
    public void setBound(Cat bound) {
        this.bonded = bound;
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

    public boolean isLikesChildren() {
        return likesChildren;
    }

    public void setLikesChildrens(boolean likesChildrens) {
        this.likesChildren = likesChildrens;
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

    public ArrayList<String> getAdoptionUpdates() {
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
    
         // filter functions start here : 
    
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
    
    public static ArrayList<Cat> FilterByGender(char gender,ArrayList<Cat> cats){
        ArrayList<Cat> Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getSex()== gender ){
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
            if(cats.get(i).isLikesChildren()==true){
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
    // A method to search for cat’s bound by its name :
    
    public Cat Searchbound(String boundName,ArrayList<Cat> cats){
        Cat boundCat = null ;
        for(Cat cat:cats){
            if(cat.getName().equalsIgnoreCase(boundName)){
               boundCat = cat ;
            }
        }
        return boundCat;
    }
    // filter functions end here 
 
    public void addNewCattoDatabase(Cat cat,ArrayList<Cat> cats){
        cats.add(cat) ;
      }
    // CatBuilder class
    public static class ConcreateCatBuilder implements CatBuilder{
        private Cat cat;

        public ConcreateCatBuilder(String catID, String name) {
            cat = new Cat();
            cat.catID = catID;
            cat.name = name;
        }

        public CatBuilder sex(char sex) {
            cat.sex = sex;
            return this;
        }

        public CatBuilder age(int age) {
            cat.age = age;
            return this;
        }

        public CatBuilder breed(String breed) {
            cat.breed = breed;
            return this;
        }

        public CatBuilder ownerID(String ownerID) {
            cat.ownerID = ownerID;
            return this;
        }

        public CatBuilder bonded(Cat bonded) {
            cat.bonded = bonded;
            return this;
        }

        public CatBuilder behavior(String behavior) {
            cat.behavior = behavior;
            return this;
        }

        public CatBuilder disabled(boolean disabled) {
            cat.disabled = disabled;
            return this;
        }

        public CatBuilder medicalHistory(String medicalHistory) {
            cat.medicalHistory = medicalHistory;
            return this;
        }

        public CatBuilder likesCats(boolean likesCats) {
            cat.likesCats = likesCats;
            return this;
        }

        public CatBuilder likesChildren(boolean likesChildren) {
            cat.likesChildren = likesChildren;
            return this;
        }

        public CatBuilder adoptionState(String adoptionState) {
            cat.adoptionState = adoptionState;
            return this;
        }

        public CatBuilder adoptionReason(String adoptionReason) {
            cat.adoptionReason = adoptionReason;
            return this;
        }

        public CatBuilder adoptionUpdates(ArrayList<String> adoptionUpdates) {
            cat.adoptionUpdates = adoptionUpdates;
            return this;
        }

        public CatBuilder adoptionFees(int adoptionFees) {
            cat.adoptionFees = adoptionFees;
            return this;
        }

        public Cat build() {
            return cat;
        }

        @Override
        public CatBuilder setCatId(int catId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setOwnerId(String ownerId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setCatName(String catName) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setSex(String sex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setAge(int age) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setBreed(String breed) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setBound(Cat bound) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setBehavior(String behavior) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setDisabled(Boolean disabled) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setMedicalHistory(String medicalHistory) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setLikesCats(Boolean likesCats) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setLikesChildrens(Boolean likesChildrens) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setAdoptionState(String adoptionState) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setAdoptionReason(String adoptionReason) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setAdoptionUpdates(ArrayList<String> adoptionUpdates) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CatBuilder setAdoptionFees(int adoptionFees) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}