package com.pluralsight;

// import scanner
import java.util.Scanner;

public class FullNameApplication1 {
    public static void main(String[] args) {

        // scanner for user to use
        Scanner scanner = new Scanner(System.in);
    }
    public String fullName(Scanner scanner) {
        // ask the user for their first name (required)
        // display their first name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        // ask user for their middle name (optional)
        // display their middle name or require them to press enter
        System.out.println("Enter your middle name: ");
        String middleName= scanner.nextLine();

        // ask user for their last name (required)
        // display their last name
        // ensure they can't leave blank and prompt them to enetr again

        // ask user for their suffic (optional)
        // display their suffix or require them to press enter

        // make sure all have trimmed leading and triling spaces
    }
}
