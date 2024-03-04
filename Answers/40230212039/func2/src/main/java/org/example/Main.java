package org.example;

import java.util.Scanner;

public class Main {

   public static int oddEvenCounter(String number, boolean searchForEven){
       int odds=0;
       int evens=0;
    if (searchForEven==true){

        for (int i =0 ; i<number.length() ; i++){
            if ((number.charAt(i) - '0') % 2 == 0){
                evens++;
            }
        }
        return evens;
    } else {

           for (int i =0 ; i<number.length() ; i++){
               if ((number.charAt(i) - '0') % 2 != 0){
                   odds++;
               }
           }
           return odds;
       }

    }

    public static void main(String[] args) {

        System.out.println("enter the numbers : ");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        System.out.println("so now if you want to count the even numbers say \"true\" and if you want to count the odd numbers say \"false\"");
        boolean search = input.nextBoolean();
        System.out.println(oddEvenCounter( numbers , search));


    }
}