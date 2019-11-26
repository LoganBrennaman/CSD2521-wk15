// This is the chapter 13 exercise assignment by Logan Brennaman on 11/16/19.

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a name. Must be two or three strings.
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        // Separate names depending on how many strings entered.
        // In case of spaces after or before strings, use trim().
        name = name.trim();
        
        // Check number of strings.
        int spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char indexChar = name.charAt(i);
            if (indexChar == ' ') {
                spaceCount++;
            }
        }
        
        // Print an error message is there are too few strings (depends on spaces).
        if (spaceCount > 2) {
            System.out.println("Error. Two many spaces.");
        } else if (spaceCount < 1) {
            System.out.println("Error. Too few spaces.");
        }
        
        // Split into first and last names if there are only two strings.
        if (spaceCount == 1) {
            String[] parts = name.split(" ");
            String first = parts[0];
            String last = parts[1];
            System.out.println("First name: " + first);
            System.out.println("Last name: " + last);
        }
        
        // Split into first, middle, and last names if there are three strings.
        if (spaceCount == 2) {
            String[] parts = name.split(" ");
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];
            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name: " + last);
        }
        
    }
}
