package org.example;

import java.util.Scanner;

public class Main {

    public static void wordFinder(String sentence, int number){
        int length=0;
        String[] words = sentence.split("\\s+");

        for (String word : words){
            length++;
        }

        if (number>length || number<=0){
            System.out.println(number + " is out Of Bound");
        } else
            System.out.println(words[number-1]);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence and a number : ");
        String input = scanner.nextLine();
        int num = scanner.nextInt();
        wordFinder(input , num);

    }
}