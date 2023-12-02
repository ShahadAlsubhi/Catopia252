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

    // Getter methods for Cat attributes
    public String getCatID() {
        return catID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public Cat getBonded() {
        return bonded;
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

    public boolean isLikesChildren() {
        return likesChildren;
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
    // CatBuilder class
    public static class CatBuilder {
        private Cat cat;

        public CatBuilder(String catID, String name) {
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
    }
}