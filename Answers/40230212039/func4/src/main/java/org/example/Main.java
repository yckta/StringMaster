package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void wordCensor(String sentence, String word, String newWord){

        String[] words = sentence.split("\\s+");
        int index = 0 ;
        for (int i=0 ; i < words.length ; i++){
            if (Objects.equals(words[i], word)){
                index = i ;
                break;
            }
        }
        words[index]=newWord;

        for (int i = 0 ; i < words.length ; i++){
            System.out.print(words[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the sentence : ");
        String sentence = input.nextLine();
        System.out.println("enter the word that you want to change : ");
        String word = input.nextLine();
        System.out.println("now enter the new word : ");
        String newWord = input.nextLine();
        wordCensor(sentence , word , newWord);
    }
}