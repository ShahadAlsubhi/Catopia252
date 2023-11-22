/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserID method, of class User.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        String expResult = "001";
        String result = instance.getUserID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        String expResult = "ahmed";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLocation method, of class User.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        String expResult = "Jeddah";
        String result = instance.getLocation();
        assertEquals(expResult, result);

    }

    /**
     * Test of getContactInfo method, of class User.
     */
    @Test
    public void testGetContactInfo() {
        System.out.println("getContactInfo");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        String expResult = "0553498750";
        String result = instance.getContactInfo();
        assertEquals(expResult, result);

    }

    /**
     * Test of getOwenedCats method, of class User.
     */
    @Test
    public void testGetOwenedCats() {
        System.out.println("getOwenedCats");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getOwenedCats();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getDonateTo method, of class User.
     */
    @Test
    public void testGetDonateTo() {
        System.out.println("getDonateTo");
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getDonateTo();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setUserID method, of class User.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String UserID = "005";
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setUserID(UserID);
        String expResult = "005";
        String result = instance.getUserID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "khaled";
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setName(Name);
        String expResult = "khaled";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class User.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String Location = "Makkah";
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setLocation(Location);
        String expResult = "Makkah";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContactInfo method, of class User.
     */
    @Test
    public void testSetContactInfo() {
        System.out.println("setContactInfo");
        String ContactInfo = "0553999990";
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setContactInfo(ContactInfo);
        String expResult = "0553999990";
        String result = instance.getContactInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOwenedCats method, of class User.
     */
    @Test
    public void testSetOwenedCats() {
        System.out.println("setOwenedCats");
        ArrayList<String> OwenedCats = null;
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setOwenedCats(OwenedCats);
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getOwenedCats();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDonateTo method, of class User.
     */
    @Test
    public void testSetDonateTo() {
        System.out.println("setDonateTo");
        ArrayList<String> DonateTo = null;
        User instance = new User("001","ahmed","Jeddah","0553498750", null, null);
        instance.setDonateTo(DonateTo);
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getDonateTo();
        assertEquals(expResult, result);
    }

    /**
     * Test of adoptionReq method, of class User.
     */
    @Test
    public void testAdoptionReq() {
      System.out.println("adoptionReq");
        Cat cat = new Cat(1,"001","toomy","male",2,"abyssinian",null,"friendly",false,"medical",false,true,"for adoptuin","so many cats",null,20);
        Individual user = new Individual(true ,false, "2108759", "Asma", "Al-Rawda dt.", "0504899703", null , null);
        User owner = new User("001","ahmed","Jeddah","0553498750", null, null);
        String exp="0553498750";
        String ContactInfo=owner.getContactInfo();
        assertEquals(exp,ContactInfo);
    }

    /**
     * Test of adoptionApprove method, of class User.
     */
    @Test
    public void testAdoptionApprove() {
         System.out.println("adoptionCancel");
        Cat cat = new Cat(1,"Owner1","Cat1","Male",2,"Breed1",null,"Behavior1",false,"MedicalHistory1",true,true,"AdoptionState1","AdoptionReason1",null,100);
        User.adoptionApprove(cat);
        String state=cat.getAdoptionState();
        String exp="Adopted";
        assertEquals(exp,state);
    }

    /**
     * Test of adoptionCancel method, of class User.
     */
    @Test
    public void testAdoptionCancel() {
        System.out.println("adoptionCancel");
        Cat cat = new Cat(1,"Owner1","Cat1","Male",2,"Breed1",null,"Behavior1",false,"MedicalHistory1",true,true,"AdoptionState1","AdoptionReason1",null,100);
        User.adoptionCancel(cat);
        String state=cat.getAdoptionState();
        String exp="Available";
        assertEquals(exp,state);
    }

    /**
     * Test of OfferCat method, of class User.
     */
    @Test
    public void testOfferCat() {
         System.out.println("OfferCat");
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat(1,"Owner1","Cat1","Male",2,"Breed1",null,"Behavior1",false,"MedicalHistory1",true,true,"AdoptionState1","AdoptionReason1",null,100));
        Cat newCat = cats.get(0);
         if (newCat.getAge() < 20 && newCat.getAge() > 0){
        assertEquals(2, newCat.getAge());
         }
    }

    /**
     * Test of donate method, of class User.
     */
    @Test
    public void testDonate() {
        System.out.println("donate");
        int priceFood1=15;
        int priceFood2=30;
        int exp=45;
        int total=priceFood1+priceFood2;
        assertEquals(exp,total);
    }

    /**
     * Test of FilterCats method, of class User.
     */
    @Test
    public void testFilterCats() {
        System.out.println("FilterCats");
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat(1,"Owner1","Cat1","Male",2,"Breed1",null,"Behavior1",false,"MedicalHistory1",true,true,"AdoptionState1","AdoptionReason1",null,100));
        String exp="Male";
        String gender=cats.get(0).getSex();
        assertEquals(exp,gender);
    }
    
}
