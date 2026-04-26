package com.pluralsight;

public class FullNameApplication {

    // import scanner to get users input
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // gather the first name from user in a variable
        System.out.println("What is your first name?");
        // Waits for users input, once they hit enter it stores data in the first variable
        String first = theScanner.nextLine();


        // gather middle name from user in a variable
        System.out.println("What is your middle name? If you don't have one please press enter.");
        // Waits for users input, once they hit enter it stores data in the first variable
        // if user has none, it should skip
        String middle = theScanner.nextLine();


        // gather last name from user in a variable
        System.out.println("What is your last name?");
        // Waits for users input, once they hit enter it stores data in the first variable
        String last = theScanner.nextLine();


        // gather suffix from user in a variable
        System.out.println("What is your suffix? If you don't have one please press enter.");
        // Waits for users input, once they hit enter it stores data in the first variable
        // if user has none, it should skip
        String suffix = theScanner.nextLine();


    }



    public static void fullName(String[] args){}


    // create a method displaying full name following rules outlined here
    public static String name(String first, String middle, String last, String suffix){


        // print prompt: first name: + name
            System.out.println("First name: " + first);


        // print prompt: middle name: + name
            System.out.println("Middle name: " + middle);
            // if none(press enter)
                if (middle == null) {
                // should skip
                theScanner.nextLine();
                }


        // print prompt: last name: + name
        System.out.println("Last name: " + last);


        // print prompt: suffix: + name
        System.out.println("Suffix: " + suffix);
            // if none(press enter)
            if (middle == null) {
            // should skip
            theScanner.nextLine();
             }


                // create a method displaying full name
        //  print prompt:  full name
    //public static String fullName(name){

      //  }

        //  if user has a suffix, full name comes first, add comma, add suffix
        // trim any leading or trailing spaces

    }
}





