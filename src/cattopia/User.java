package cattopia;


import java.time.LocalDate;
import java.util.*;

public class User {

    static void FilterCats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String UserID;
    private String Name;
    private String Location;
    private String ContactInfo;
    private ArrayList<String> OwenedCats;
    private ArrayList<String> DonateTo; 


    public User(String UserID, String Name, String Location, String ContactInfo, ArrayList<String> OwenedCats, ArrayList<String> DonateTo) {
        this.UserID = UserID;
        this.Name = Name;
        this.Location = Location;
        this.ContactInfo = ContactInfo;
        this.OwenedCats = OwenedCats;
        this.DonateTo = DonateTo;
    }

    public User(String UserID, String Name, String Location, String ContactInfo) {
        this.UserID = UserID;
        this.Name = Name;
        this.Location = Location;
        this.ContactInfo = ContactInfo;
    }
    
    public User() {
    }
    
    

    public String getUserID() {
        return UserID;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public ArrayList<String> getOwenedCats() {
        return OwenedCats;
    }

    public ArrayList<String> getDonateTo() {
        return DonateTo;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setContactInfo(String ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    public void setOwenedCats(ArrayList<String> OwenedCats) {
        this.OwenedCats = OwenedCats;
    }

    public void setDonateTo(ArrayList<String> DonateTo) {
        this.DonateTo = DonateTo;
    }
    
    
    
    
    // a method to request adopting a cat from their owner while checking if the requirement are met
    public static void adoptionReq(Cat cat, Individual user, User owner) {
        Scanner input = new Scanner (System.in);
        // check if the conditions are met
        if (!((user.getOwenedCats()).isEmpty()) == cat.isLikesCats() && user.isHasChildren() == cat.isLikesChildrens()) {

            if( owner instanceof Individual) {  //if the the user is adopting from an individual

                System.out.println("These are the owner contatct info, please contact them to arrage adoption.\n" + ((Individual)owner).getContactInfo() );
                cat.setAdoptionState("Pending"); // set cat's adoption state

            } else if(owner instanceof Shelter) { //if the the user is adopting from a shelter

                System.out.println("please enter a time for the meeting and make sure it is written like this yyyy/mm/dd 00:00PM/AM: ");

                // scanner for user input
                String timeChoice = input.next();
                if (((Shelter)owner).searchAppointment(timeChoice) == null ){
                    Appointment app = new Appointment( timeChoice, user.getUserID(), owner.getUserID(), "Pending");
                
                       ((Shelter)owner).getReservedAppointment().add(app);
                       
                System.out.println("You have succesfully made an apponitment with this shelter!");
                cat.setAdoptionState("Pending"); // set cat's adoption state
                }
                else{
                    
                      System.out.println("sorry! this timing is already reserved. please pick another one.");
                 
 
                
                }
                
              

            }

        } else {
            System.out.println("Sorry! you cannot adopt this cat due to unmet conditions.");
        }

    }
// a method for approving adoption reqest 
    public static void adoptionApprove(Cat cat) {
        cat.setAdoptionState("Adopted");  // set cat's adoption state
    }
// a method for canceling adoption reqest
    public static void adoptionCancel(Cat cat) {
        cat.setAdoptionState("Available");  // set cat's adoption state
    }
    
    
  
    //Offer Cat Method !!
    public void OfferCat(ArrayList<Cat> cats){
        Scanner input = new Scanner(System.in);
// Prompt the user to enter cat info :
        System.out.println("Enter cat id: ");
         int catId = input.nextInt();
         System.out.println("Enter owner id: ");
         String ownerId = input.next();
        System.out.println("Enter cat name: "); 
         String catName = input.next();
        System.out.println("Enter cat sex: "); 
         String sex = input.next();
        System.out.println("Enter cat age: "); 
         int age = input.nextInt();
        System.out.println("Enter cat breed: "); 
         String breed = input.next();
        System.out.println("Enter cat Bound name: "); 
         String CatBoundName = input.next(); // Taking just that name to search for the cat object later.
        System.out.println("Enter cat behavior: "); 
         String behavior = input.next();
        System.out.println("is the cat disabled: "); 
         boolean disabled = input.nextBoolean();
        System.out.println("Enter cat medical history: "); 
         String medicalHistory = input.next();
        System.out.println("is the cat like other cats: ");
         boolean likesCats = input.nextBoolean();
        System.out.println("is the cat like Childrens: "); 
         boolean likesChildrens = input.nextBoolean();
        System.out.println("Enter cat adoption State: "); 
         String adoptionState = input.next();
        System.out.println("Enter cat adoption Reason: "); 
         String adoptionReason = input.next();
        System.out.println("Enter cat adoption Fees: ");  
         int adoptionFees = input.nextInt();
         
           // Create Cat object :
           Cat newCat = new Cat(catId,ownerId,catName, sex, age,breed,null,behavior,disabled,medicalHistory,likesCats,likesChildrens,adoptionState, adoptionReason,null, adoptionFees);
           cats.add(newCat);
        // Setting the cat’s bound after searching for it : 
        Cat objectBound = newCat.Searchbound(CatBoundName,cats) ;
        cats.get(cats.size()-1).setBound(objectBound);
      // Add it to the cats database ( Arraylist ) :
        cats.get(cats.size()-1).addNewCattoDatabase(cats.get(cats.size()-1),cats) ;
     // Printing a message to the user :
        System.out.println("Your Cat is added to the DataBase");
     
        
    } //Offer cat end here !! 

    //Donation method start here
    
    public static void donate(){
        Scanner input = new Scanner(System.in);
        //Fill donation information
        String command;

       do { 
           System.out.println("\nWhat type of donation will you make?\n1-Food donation\n2-Money donation\n3-Toys donation\n4-Quit");
           command = input.next(); 
           if (command.equalsIgnoreCase("1")) {
            //Fill food infrmation    
                System.out.println("Enter Brand name: ");
                String BrandName = input.next();
                System.out.println("Enter Exp date as (dd/mm/yyyy),: ");
                String ExpDate = input.next();
                System.out.println("Enter Manufec date as (dd/mm/yyyy),: ");
                String ManufecDate = input.next();
                System.out.println("Enter size: ");
                String size = input.next();
                System.out.println("Enter Price: ");
                int price = input.nextInt();
               
                System.out.println("The brand of the food:"+BrandName
                        +"\nThe food Exp date:"+ExpDate
                        +"\nThe food Manufec date:"+ManufecDate
                        +"\nThe food size:"+size
                        +"\nThe food price:"+price);
                LocalDate DonationDate = java.time.LocalDate.now();
                System.out.println("The donation was in: "+DonationDate);
            }
            if (command.equalsIgnoreCase("2")) {
                System.out.println("How much money do you want to donate?");
                int amount = input.nextInt();
                if(amount <=0){
                    System.out.println("You have entered the wrong amount.");
                }
                if(amount>0){
                    System.out.println("Thanks for your donation.");
                    LocalDate DonationDate = java.time.LocalDate.now();
                    System.out.println("The donation was in: "+DonationDate);
                }
            }
            if (command.equalsIgnoreCase("3")) {
                //Fill toys information
                System.out.println("What'the size of toys will you donate?");
                String size = input.next();
                System.out.println("What'the condition of toys will you donate?"); 
                String condition = input.next();
                System.out.println("Enter Price: ");
                int price = input.nextInt();
                System.out.println("The size of the toy: "+size
                        +"\nThe condition of the toy: "+condition
                        +"\nThe food price:"+price);
                LocalDate DonationDate = java.time.LocalDate.now();
                System.out.println("The donation was in: "+DonationDate);
            }
           
    } while (!command.equalsIgnoreCase("4"));
       System.out.println("Quit.");
    }
    
    //Donation method end here
    
     public static void FilterCats(ArrayList<Cat> cats){
        System.out.println("filter cats by: "
                + "1-Breed  2-Age  3-Gender  4-behavior"
                + "5-Disabled  6-Likes children  7-Likes cats");
        Scanner input = new Scanner(System.in);
        int Uchoice=input.nextInt();
        
        switch(Uchoice){
            case 1:
                System.out.println("what breed do you want to display ? ");
                String breed=input.next();
                ArrayList Filtered1=Cat.FilterByBreed(breed,cats);
                 for(int i=0;i<Filtered1.size();i++){
                      System.out.println(Filtered1.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 2:
                System.out.println("what age do you want to display ? ");
                int age=input.nextInt();
                ArrayList Filtered2=Cat.FilterByAge(age,cats);
                 for(int i=0;i<Filtered2.size();i++){
                      System.out.println(Filtered2.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 3:
                System.out.println("what gender do you want to display ? ");
                String gender=input.next();
                ArrayList<Cat> Filtered3=Cat.FilterByGender(gender,cats);
                 for(int i=0;i<Filtered3.size();i++){
                      System.out.println(Filtered3.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 4:
                System.out.println("what behavior do you to display ? ");
                String behavior=input.next();
                ArrayList Filtered4=Cat.FilterByBehavior(behavior,cats);
                 for(int i=0;i<Filtered4.size();i++){
                      System.out.println(Filtered4.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 5: 
                ArrayList Filtered5=Cat.FilterDisabled(cats);
                for(int i=0;i<Filtered5.size();i++){
                      System.out.println(Filtered5.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 6:
                ArrayList Filtered6=Cat.FilterLikesChildren(cats);
                 for(int i=0;i<Filtered6.size();i++){
                      System.out.println(Filtered6.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            case 7:
                ArrayList Filtered7=Cat.FilterLikesCats(cats);
                 for(int i=0;i<Filtered7.size();i++){
                      System.out.println(Filtered7.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                break;
            default :
                System.out.println("invalid choice ");
                break;  
        }
    }
     
}
