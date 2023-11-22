/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;
import java.util.*;
/**
 *
 * @author shaha
 */
public class CatTopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        ArrayList<User> accounts = new  ArrayList<User>();
        ArrayList<Cat> cats = new  ArrayList<Cat>(100);
        
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
                  accounts.get(0).OfferCat(cats);
        
              
            }
                else if (command.equalsIgnoreCase("3")) {
                    User.FilterCats(cats);
        
              
            }
                else if (command.equalsIgnoreCase("4")) {
                    User.donate();
        
              
            }  

 

        } while (!command.equalsIgnoreCase("5"));
        System.out.println("thank you (=^･ｪ･^=))ﾉ彡☆");
        System.out.println("Quit.");
}
    
    public static void addCats(ArrayList<Cat> cats){
        
        cats.add(new Cat(1,"1","toomy","male",2,"abyssinian",null,"friendly",false,"medical",false,true,"for adoptuin","so many cats",null,20));
        cats.add(new Cat(2,"2","lucy","female",4,"bengal",null,"relaxed",false,"medical",true,false,"for adoptuin","to save money",null,25));
        cats.add(new Cat(3,"3","luna","female",3,"bengal",null,"playful",true,"medical",true,true,"for adoptuin","so many cats",null,30));
        cats.add(new Cat(4,"4","charlie","male",1,"birman",null,"relaxed",true,"medical",true,true,"for adoptuin","so young",null,20));
        cats.add(new Cat(5,"5","bella","female",4,"bombay",null,"playful",false,"medical",false,false,"for adoptuin","too old",null,25));
        
    }
    
    public static User searchUser(String id,  ArrayList<User> accounts){
              
  for (int i = 0; i < accounts.size(); i++){
      if (accounts.get(i).getUserID().equalsIgnoreCase(id))
          return accounts.get(i);
  }
  return null;
     }
    
}
