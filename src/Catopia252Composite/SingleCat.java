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
public class SingleCat implements ComposeCat {
    
    private Cat cat;
    private ArrayList<Kitten> ListOfKittens;
   // public static ArrayList<Cat> cats;

    public SingleCat(Cat cat) {
        this.cat = cat;
        this.ListOfKittens = new ArrayList<Kitten>();
    }



    SingleCat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
      public void addKitten( Kitten kit ){
          ListOfKittens.add(kit);
      }
      
    @Override
      public void RemoveKitten(Kitten kit){
          ListOfKittens.remove(kit);
      }
    @Override
      public Kitten getChild(int i){
          return ListOfKittens.get(i); 
      }
      public ArrayList<Kitten> getListOfKittens(){
          return this.ListOfKittens ;
      }
}

