/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catopia252Builder;

import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
       
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cat ID:");
        int catId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Cat Name:");
        String catName = scanner.nextLine();

        // Create a Cat profile using the Builder pattern with user-input attributes
       Cat.CatBuilder catBuilder = new Cat.CatBuilder()
                .setcatId(catId)
                .setcatName(catName);
                // Set other attributes from user input
                 // Build the Cat profile
        Cat cat = catBuilder.build();

        // Use the created Cat profile
        System.out.println("Cat profile:");
        System.out.println(cat.toString());
    }
}
