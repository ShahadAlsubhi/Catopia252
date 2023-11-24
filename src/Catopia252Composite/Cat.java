/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Composite;

import java.util.ArrayList;

public interface Cat {
    
    public int getCatId();

    public void setCatId(int catId);

    public String getOwnerId();

    public void setOwnerId(String ownerId);

    public String getCatName();

    public void setCatName(String catName);

    public String getSex();

    public void setSex(String sex);

    public int getAge();

    public void setAge(int age);

    public String getBreed();

    public void setBreed(String breed);

    public SingleCat getBound();

    public void setBound(SingleCat bound);

    public String getBehavior();

    public void setBehavior(String behavior);

    public boolean isDisabled() ;

    public void setDisabled(boolean disabled);

    public String getMedicalHistory();

    public void setMedicalHistory(String medicalHistory);

    public boolean isLikesCats();

    public void setLikesCats(boolean likesCats);

    public boolean isLikesChildrens();

    public void setLikesChildrens(boolean likesChildrens);

    public String getAdoptionState();

    public void setAdoptionState(String adoptionState);

    public String getAdoptionReason();

    public void setAdoptionReason(String adoptionReason);

    public ArrayList getAdoptionUpdates();

   public void setAdoptionUpdates(ArrayList adoptionUpdates);
    public int getAdoptionFees();

    public void setAdoptionFees(int adoptionFees);
    
    // filter function start
    
    public static ArrayList<SingleCat> FilterByBreed(String breed,ArrayList<SingleCat> cats){
        ArrayList Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getBreed().equalsIgnoreCase(breed)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterByAge(int age,ArrayList<SingleCat> cats){
        ArrayList Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getAge()==age){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterByGender(String gender,ArrayList<SingleCat> cats){
        ArrayList<SingleCat> Filtered= new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getSex().equalsIgnoreCase(gender)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterByBehavior(String behavior,ArrayList<SingleCat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).getBehavior().equalsIgnoreCase(behavior)){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterDisabled(ArrayList<SingleCat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).isDisabled()==true){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterLikesChildren(ArrayList<SingleCat> cats){
        ArrayList Filtered = new ArrayList();
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).isLikesChildrens()==true){
                Filtered.add(cats.get(i));
            }
        }
        return Filtered;
    }
    
    public static ArrayList<SingleCat> FilterLikesCats(ArrayList<SingleCat> cats){
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
    
    public SingleCat Searchbound(String boundName,ArrayList<SingleCat> cats);
      
    // A method to add a new cat to the database ( arraylist ) : 
      public void addNewCattoDatabase(SingleCat cat,ArrayList<SingleCat> cats);
    @Override
       public String toString();
}
