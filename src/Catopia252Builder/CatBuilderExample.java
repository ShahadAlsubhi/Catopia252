/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Builder;

import java.util.ArrayList;
import java.util.Scanner;

public class CatBuilderExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather cat information from the user
        System.out.println("Enter cat information:");
        System.out.print("Cat ID: ");
        String catID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Sex (M/F): ");
        char sex = scanner.nextLine().charAt(0);

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Breed: ");
        String breed = scanner.nextLine();

        System.out.print("Owner ID: ");
        String ownerID = scanner.nextLine();

        // Optional: gather information about a bonded cat
        System.out.print("Is the cat bonded with another cat? (Y/N): ");
        Cat2 bondedCat = null;
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.print("Enter bonded cat's ID: ");
            String bondedCatID = scanner.nextLine();
            bondedCat = new Cat2.CatBuilder(bondedCatID, "BondedCat").build();
        }

        // Create a Cat object using the CatBuilder
        Cat2 cat = new Cat2.CatBuilder(catID, name)
                .sex(sex)
                .age(age)
                .breed(breed)
                .ownerID(ownerID)
                .bonded(bondedCat)
                .build();

        // Display the created Cat object
        System.out.println("\nCat created:");
        System.out.println(cat.toString());

        
    }
}

