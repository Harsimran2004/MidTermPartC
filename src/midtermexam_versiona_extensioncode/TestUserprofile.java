/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author supre
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + " => " + genres[i]);
        }

        // Prompt user 
        System.out.print("Enter your name please: ");
        String userName = input.nextLine();

        // Prompt user 
        System.out.print("Choose your favorite genre(number): ");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline character
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice.Please again!");
            return;
        }
        String userGenre = genres[choice - 1];

        // Create UserProfile object
        UserProfile userProfile = new UserProfile(userName, userGenre);

        // Display message
        System.out.println("User profile created successfully for " + userProfile.getUserID() +
                " with favorite genre " + userProfile.getGenre());

}

}
