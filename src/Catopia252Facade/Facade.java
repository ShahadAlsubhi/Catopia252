/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;
import cattopia.Cat;
import static cattopia.CatTopia.addCats;
import cattopia.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Facade {
    public static void main(String[] args){
       
         ArrayList<User> accounts = new  ArrayList<User>();
        ArrayList<Cat> cats = new  ArrayList<Cat>(100);
        
        addCats(cats); //add cats to the array
        
          Scanner input = new Scanner(System.in); //Scanner to read input
                
            // Defining and creating Individual object as adopter with some random data assigned to it : 
            ArrayList<String> userOwnedCats = new ArrayList<>(); userOwnedCats.add("1");
            ArrayList<String> userDonateTo =  new ArrayList<>() ; userDonateTo.add("Small Kittens shelter") ;
            cattopia.Individual individual =new cattopia.Individual(true ,false, "2108759", "Asma", "Al-Rawda dt.", "0504899703", userOwnedCats , userDonateTo);
            accounts.add(individual);
            
            // Defining and creating an Individual object as Owner with some random data assigned to it : 
            ArrayList<String> OwnerOwnedCats = new ArrayList<>(); userOwnedCats.add("2");
            cattopia.Individual owner = new cattopia.Individual(false ,false, "2108766", "Sarah", "Al-Jamaa dt.", "0501854703", OwnerOwnedCats , null);
            accounts.add(owner);
            
            // Defining and creating Shelter object with some random data assigned to it : 
            ArrayList<cattopia.Appointment> ReservedAppointment = new ArrayList<>(); 
            ReservedAppointment.add(new cattopia.Appointment ("2002/07/23", "3", "8", " "));
            cattopia.Shelter shelter = new cattopia.Shelter("Small Kittens shelter", true, null, ReservedAppointment);
            accounts.add(shelter);
            User user = accounts.get(0);
            
        String command = null;
           
            System.out.println("--------------- Welcome to Catopia System ---------------");
            System.out.println("1. Adopt a Cat");
            System.out.println("2.Offer a cat for adoption");
            System.out.println("3. Filter avaible Cats");
            System.out.println("4. Donate to a Shelter");
            System.out.println("5. Quit");
            
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
                  User.adoptionReq(cats.get(CatID-1),individual,shelter); // The adoption is from a shelter in this case.
                  if("available".equals(cats.get(CatID-1).getAdoptionState()))
                  cats.get(CatID-1).setAdoptionState("unavailable");
              
              }else if (command.equalsIgnoreCase("2")) {
                //  accounts.get(0).OfferCat(cats);
                
        
              
            }
                else if (command.equalsIgnoreCase("3")) {
                    User.FilterCats(cats);
        
              
            }
                else if (command.equalsIgnoreCase("4")) {
                  //  User.donate();
                   DonateToShelter.donate(user.getName());
              
            }  

 

        } while (!command.equalsIgnoreCase("5"));
        System.out.println("thank you (=^･ｪ･^=))ﾉ彡☆");
        System.out.println("Quit.");
}
     public static User searchUser(String id,  ArrayList<User> accounts){
              
  for (int i = 0; i < accounts.size(); i++){
      if (accounts.get(i).getUserID().equalsIgnoreCase(id))
          return accounts.get(i);
  }
  return null;
     }
    }

