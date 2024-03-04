package org.example;

import java.util.Scanner;

public class Main {

    public static void normalizingName(String firstName, String lastName){
        char[] firstNameChar = firstName.toCharArray();
        char[] lastNameChar = lastName.toCharArray();

        for (int i = 0 ; i < firstNameChar.length ; i++){
            if (firstNameChar[i] >= 'A' && firstNameChar[i] <= 'Z'){
                firstNameChar[i]= (char) (firstNameChar[i]+32);
            }

        }
        firstNameChar[0]= (char) (firstNameChar[0]-32);

        for (int i = 0 ; i < lastNameChar.length ; i++){
            if (lastNameChar[i] >= 'A' && lastNameChar[i] <= 'Z'){
                lastNameChar[i]= (char) (lastNameChar[i]+32);
            }

        }
        lastNameChar[0]= (char) (lastNameChar[0]-32);

        for (int i = 0 ; i<firstNameChar.length ; i++){
            System.out.print(firstNameChar[i]);
        }
        System.out.print(" ");
        for (int i = 0 ; i<lastNameChar.length ; i++){
            System.out.print(lastNameChar[i]);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first name : ");
        String firstName = input.nextLine();
        System.out.println("last name : ");
        String lastName = input.nextLine();
        normalizingName(firstName,lastName);

    }
}