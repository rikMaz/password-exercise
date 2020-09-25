package de.neuefische.cologne.passwordexercise;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        /*
        Scanner input_value = new Scanner(System.in);
        System.out.println("Bitte Password eingeben: ");
        String password = input_value.nextLine();
        */

        String[] passwords = {"Aid82jas","askl4k23","askf","hjh28sdafas","deineMudda","EsIstSoTollHier","asj285jasf9"};

        for (int i = 0; i < passwords.length; i++) {

            System.out.println(passwords[i] + ": " + checkPassword(passwords[i]));
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

        if (password.matches(".*\\d.*")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkPasswordLowercaseIncluded(String password) {

        if (password.matches(".*\\p{Lower}.*")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkPasswordUppercaseIncluded(String password) {

        if (password.matches(".*\\p{Upper}.*")) {
            return true;
        } else {
            return false;
        }

    }

}
