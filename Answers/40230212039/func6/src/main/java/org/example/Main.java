package org.example;

import java.util.Scanner;

public class Main {

    public static void doubleChar(String word){

        char[] wordChar = word.toCharArray();

        for (int i = 0 ; i < wordChar.length ; i++){
            for (int j = 0 ; j < wordChar.length ; j++){
                if (wordChar[i]==wordChar[j]){
                    if (j-i==1){
                    wordChar[i]='0';}
                }
            }
        }

        for (int i = 0 ; i<wordChar.length ; i++){
            if (wordChar[i]=='0'){
                continue;
            }
            System.out.print(wordChar[i]);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word : ");
        String word = input.nextLine();
        doubleChar(word);
    }
}