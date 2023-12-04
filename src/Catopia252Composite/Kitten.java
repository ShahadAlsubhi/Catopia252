/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Composite;

import Catopia252Observer.Cat;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Kitten implements ComposeCat{
    

     private Cat kitten ;
     private SingleCat mother ;

    public Kitten(Cat kitten) {
        this.kitten = kitten ;
    }



    Kitten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public void addKitten( Kitten kit ){}
     
      public void RemoveKitten(Kitten kit){}
      
      public Kitten getChild(int i){ return null ;}
      
      public SingleCat getKittenMother(){
          return this.mother ;
      }
      
      public void setKittenMother(SingleCat cat){
          this.mother = cat ;
      }

}



