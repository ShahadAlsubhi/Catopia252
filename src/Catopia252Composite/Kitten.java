/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Composite;

import Catopia252Builder.Cat;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Kitten implements ComposeCat{
    
    
     private Cat cat ;

    public Kitten(Cat cat) {
        this.cat = cat;
    }



    Kitten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public void addKitten( Kitten kit ){}
     
      public void RemoveKitten(Kitten kit){}
      
      public Kitten getChild(int i){ return null ;}

}



