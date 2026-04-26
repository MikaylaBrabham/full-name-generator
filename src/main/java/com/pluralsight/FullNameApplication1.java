package com.pluralsight;

// import scanner
import java.util.Scanner;

public class FullNameApplication1 {
    public static void main(String[] args) {

        // scanner for user to use
        Scanner scanner = new Scanner(System.in);
        // enter the defined methods
         String fullName = getName(scanner);
        System.out.println("Full Name: " + fullName);
         // close the scanner
         scanner.close();



    }
    public static String getName(Scanner scanner) {
        // ask the user for their first name (required)
        // display their first name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        // make sure their is imput and trailing and leading statements are clear
        while (firstName.isEmpty()) {
            System.out.println("Please enter your first name, it is required: ");
            firstName = scanner.nextLine().trim();
        }

        // ask user for their middle name (optional)
        // display their middle name or require them to press enter
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();


        // ask user for their last name (required)
        // display their last name
        // ensure they can't leave blank and prompt them to enetr again
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        // make sure their is imput and trailing and leading statements are clear
        while (lastName.isEmpty()) {
            System.out.println("Please enter your last name, it is required: ");
            lastName = scanner.nextLine().trim();
        }

        // ask user for their suffix (optional)
        // display their suffix or require them to press enter
        System.out.println("Enter your suffix: ");
        String suffixName = scanner.nextLine().trim();

        // make sure all have trimmed leading and triling spaces
        //String fullName = firstName + "|" + middleName + "|" + lastName + "|" + suffixName;
        //String [] nameParts = fullName.split("\\|");
       String fullName = firstName + " " + middleName + " " + lastName + ", " + suffixName;
        if (middleName.isEmpty() && suffixName.isEmpty()){
            String noSuffixMiddleName = firstName + " " + lastName;
            System.out.println("Full Name: " + noSuffixMiddleName);
        }
        if (suffixName.isEmpty()){
            String noSuffix = firstName + " " + middleName + " " + lastName;
            System.out.println("Full Name: " + "," + noSuffix);
        }
        if (middleName.isEmpty()){
            String noMiddle = firstName + " " + lastName + ", " + suffixName;
            System.out.println("Full Name: " + noMiddle);
        }
        //else {
         // String fullName = firstName + " " + middleName + " " + lastName + " ," + suffixName;
         //   System.out.println("Full Name: " + fullName);
        //}
        return fullName;
    }
}
