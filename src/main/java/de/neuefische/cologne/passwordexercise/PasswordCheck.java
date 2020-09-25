package de.neuefische.cologne.passwordexercise;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        // create string
        String[] groupOfPasswords = new String[10];

        // for-loop to input passwords and load into array
        for (int i = 0 ; i < 10 ; i++) {
            Scanner input_value = new Scanner(System.in);
            System.out.println("Bitte Password " + (i + 1) + " eingeben: ");
            String password = input_value.nextLine();
            groupOfPasswords[i] = password;

        }

        // for-loop to check password array against rules

        for (int i = 0; i < groupOfPasswords.length; i++) {

            System.out.println(groupOfPasswords[i] + ": " + checkPassword(groupOfPasswords[i]));
        }

    }

    public static String checkPassword(String password) {
       //return checkPasswordLength(password) && checkPasswordNumberIncluded(password) && checkPasswordLowercaseIncluded(password) && checkPasswordUppercaseIncluded(password);

        if (!checkPasswordLength(password)) {
            return "Passwort muss mind. 8 Zeichen enthalten";
        }
        if (checkPasswordNumberIncluded(password) == false) {
            return "Passwort muss mind. eine Zahl enthalten";
        }
        if (checkPasswordLowercaseIncluded(password) == false) {
            return "Passwort muss mind. einen kleinen Buchsaben enthalten";
        }
        if (checkPasswordUppercaseIncluded(password) == false) {
            return "Passwort muss mind. einen großen Buchstaben enthalten";
        }

        return "Passwort ist GEIL";


    }


    public static boolean checkPasswordLength(String password) {

        return password.length() >= 8;

    }

    public static boolean checkPasswordNumberIncluded (String password) {

        return password.matches(".*\\d.*");

    }

    public static boolean checkPasswordLowercaseIncluded(String password) {

        return password.matches(".*\\p{Lower}.*");

    }

    public static boolean checkPasswordUppercaseIncluded(String password) {

        return password.matches(".*\\p{Upper}.*");

    }

}
