/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Builder;

import java.util.ArrayList;

// Cat class representing the profile
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

    // Private constructor to prevent direct instantiation
    private Cat(CatBuilder builder) {
        this.catId = builder.catId;
        this.ownerId = builder.ownerId;
        this.catName = builder.catName;
        this.sex = builder.sex;
        this.age = builder.age;
        this.breed = builder.breed;
        this.bound = builder.bound;
        this.behavior = builder.behavior;
        this.disabled = builder.disabled;
        this.medicalHistory = builder.medicalHistory;
        this.likesCats = builder.likesCats;
        this.likesChildrens = builder.likesChildrens;
        this.adoptionState = builder.adoptionState;
        this.adoptionReason = builder.adoptionReason;
        this.adoptionUpdates = builder.adoptionUpdates;
        this.adoptionFees = builder.adoptionFees;
    }

  // Getter methods for Cat attributes
    public int getCatId() {
        return catId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getCatName() {
        return catName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Cat getBound() {
        return bound;
    }

    public String getBehavior() {
        return behavior;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public boolean isLikesCats() {
        return likesCats;
    }

    public boolean isLikesChildrens() {
        return likesChildrens;
    }

    public String getAdoptionState() {
        return adoptionState;
    }

    public String getAdoptionReason() {
        return adoptionReason;
    }

    public ArrayList<String> getAdoptionUpdates() {
        return adoptionUpdates;
    }

    public int getAdoptionFees() {
        return adoptionFees;
    }   
    // Builder class for constructing Cat profile
    public static class CatBuilder {
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

        // Builder constructor with mandatory parameters
        public CatBuilder setcatId(int catId){
            this.catId = catId;
            return this;
        }
        public CatBuilder setcatName(String catName){
        this.catName = catName;
        return this;
        }
        // Setter methods for optional attributes
        public CatBuilder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public CatBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public CatBuilder setage(int age){
            this.age = age;
            return this;
        }
        public CatBuilder setbreed(String breed){
            this.breed = breed;
            return this;
        }
        public CatBuilder setbound(Cat bound){
            this.bound = bound;
            return this;
        }
        public CatBuilder setbehavior(String behavior){
            this.behavior = behavior;
            return this;
        }
        public CatBuilder setdisabled(Boolean disabeld){
            this.disabled = disabled;
            return this;
        }
        public CatBuilder setmedicalHistory(String medicalHistory){
            this.medicalHistory = medicalHistory;
            return this;
        }
        public CatBuilder setlikesCats(Boolean likesCats){
            this.likesCats = likesCats;
            return this;
        }
        public CatBuilder setlikesChildrens(Boolean likesChildrens){
            this.likesChildrens = likesChildrens;
            return this;
        }
        public CatBuilder setadoptionState(String adoptionState){
            this.adoptionState = adoptionState;
            return this;
        }
        public CatBuilder setadoptionReason(String adoptionReason){
            this.adoptionReason = adoptionReason;
            return this;
        }
        public CatBuilder setadoptionUpdates(ArrayList<String> adoptionUpdates){
            this.adoptionUpdates = adoptionUpdates;
            return this;
        }
        public CatBuilder setadoptionReason(int adoptionFees){
            this.adoptionFees = adoptionFees;
            return this;
        }
        // Method to build the Cat profile
        public Cat build() {
            return new Cat(this);
        }
    }

}
