/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;
import Catopia252.DonationFactory.DonationFactory;
import Catopia252Composite.SingleCat;
import java.util.ArrayList;
import java.util.Scanner;
import Catopia252Observer.Cat; 


public class Facade {
    public static void main(String[] args){
       
        ArrayList<user> accounts = new  ArrayList<user>();
        ArrayList<Cat> cats = new  ArrayList<Cat>(100);
        DonationFactory donationFactory = new DonationFactory();
        // Whenever we create a bond we should add the cat that has kitten here : 
        ArrayList<SingleCat> catsHasKitten = new  ArrayList<SingleCat>(100);
       
        
        
        addCats(cats); //add cats to the array
          Scanner input = new Scanner(System.in); //Scanner to read input
                
            // Defining and creating Individual object as adopter with some random data assigned to it : 
            ArrayList<String> userOwnedCats = new ArrayList<>(); userOwnedCats.add("1");
            ArrayList<String> userDonateTo =  new ArrayList<>() ; userDonateTo.add("Small Kittens shelter") ;
            Individual individual =new Individual(true ,false, "2108759", "Asma", "Al-Rawda dt.", "0504899703", userOwnedCats , userDonateTo);
            accounts.add(individual);
            
            // Defining and creating an Individual object as Owner with some random data assigned to it : 
            ArrayList<String> OwnerOwnedCats = new ArrayList<>(); userOwnedCats.add("2");
            Individual owner = new Individual(false ,false, "2108766", "Sarah", "Al-Jamaa dt.", "0501854703", OwnerOwnedCats , null);
            accounts.add(owner);
            
            // Defining and creating Shelter object with some random data assigned to it : 
            ArrayList<Appointment> ReservedAppointment = new ArrayList<>(); 
            ReservedAppointment.add(new Appointment ("2002/07/23", "3", "8", " "));
            Shelter shelter = new Shelter("Small Kittens shelter", true, null, ReservedAppointment);
            accounts.add(shelter);
            user user = accounts.get(0);
            
        String command = null;
           
            System.out.println("--------------- Welcome to Catopia System ---------------");
            System.out.println("1. Adopt a Cat");
            System.out.println("2.Offer a cat for adoption");
            System.out.println("3. Filter avaible Cats");
            System.out.println("4. Donate to a Shelter");
            System.out.println("5. Subscribe to a cat");
            System.out.println("6. Update Cat status");
            System.out.println("7. Quit");
            
           do { // Reading the commands
            System.out.println("Please Enter your Choice: ");
            command = input.next();
              if (command.equalsIgnoreCase("1")) {
                  System.out.println("the available cats : ");
                  
                  for(int i=0;i<cats.size();i++){
                      System.out.println(cats.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                  
                  System.out.println("enter the cat ID you would like to adopt : ");
                  int CatID=input.nextInt();
                  user.adoptionReq(cats.get(CatID-1),individual,shelter); // The adoption is from a shelter in this case.
                  if("available".equals(cats.get(CatID-1).getAdoptionState()))
                  cats.get(CatID-1).setAdoptionState("unavailable");
              
              }else if (command.equalsIgnoreCase("2")) {
                  accounts.get(0).OfferCat(cats);
                  
                
        
              
            }
                else if (command.equalsIgnoreCase("3")) {
                    user.FilterCats(cats);
        
              
            }
                else if (command.equalsIgnoreCase("4")) {
                  //  User.donate();
                   DonateToShelter.donate(user.getName(), donationFactory);
              
            }  
              else if (command.equalsIgnoreCase("5")) {
                  System.out.println("Write the cat id that you want to get notification about : ");
                  int id = input.nextInt();
                  Cat.addObservers(cats.get(id)) ;
                  
                  System.out.println("You have successfully subscribed to the cat with the ID : " + cats.get(id).getCatId());
                     
            } 
              
              

 

        } while (!command.equalsIgnoreCase("7"));
        System.out.println("thank you (=^･ｪ･^=))ﾉ彡☆");
        System.out.println("Quit.");
}
     public static user searchUser(String id,  ArrayList<user> accounts){
              
  for (int i = 0; i < accounts.size(); i++){
      if (accounts.get(i).getUserID().equalsIgnoreCase(id))
          return accounts.get(i);
  }
  return null;
     }
     public static void addCats(ArrayList<Cat> cats){
        
        cats.add(new Cat(1,"1","toomy","male",2,"abyssinian",null,"friendly",false,"medical",false,true,"for adoptuin","so many cats",null,20));
        cats.add(new Cat(2,"2","lucy","female",4,"bengal",null,"relaxed",false,"medical",true,false,"for adoptuin","to save money",null,25));
        cats.add(new Cat(3,"3","luna","female",3,"bengal",null,"playful",true,"medical",true,true,"for adoptuin","so many cats",null,30));
        cats.add(new Cat(4,"4","charlie","male",1,"birman",null,"relaxed",true,"medical",true,true,"for adoptuin","so young",null,20));
        cats.add(new Cat(5,"5","bella","female",4,"bombay",null,"playful",false,"medical",false,false,"for adoptuin","too old",null,25));
        
    }

}
