/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;


import Catopia252Composite.Kitten;
import Catopia252Composite.SingleCat;
import Catopia252Observer.Cat;


public class CatFamily {

  public SingleCat CreateBond(Cat cat ,Cat kitten ){
      SingleCat newCat = createNewCat(cat) ;
      Kitten bondedKitten = new Kitten(kitten) ;
      newCat.addKitten(bondedKitten);
      bondedKitten.setKittenMother(newCat);
      return newCat ;
}
  
   public SingleCat createNewCat(Catopia252Observer.Cat cat){
      SingleCat newCat = new SingleCat(cat);
      return newCat ;
  }
   
 // public void displayAllCatKittens(){
      
  //}
    
}
