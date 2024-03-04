package org.example;

import java.util.Scanner;


public class Main {

    public static String firstWord (String wordA, String wordB){
        if (wordA.length()>wordB.length()) {
                for (int i = 0; i < wordB.length(); i++) {
                    if (wordA.charAt(i)>wordB.charAt(i)){
                        return wordB;
                    }
                    if (wordB.charAt(i)>wordA.charAt(i)) {
                        return wordA;
                    } if (wordA.charAt(i)==wordB.charAt(i)){
                        continue;
                    }
                }
                return wordB;
            }

        if (wordB.length()>wordA.length()) {
            for (int i = 0; i < wordA.length(); i++) {
                if (wordA.charAt(i)>wordB.charAt(i)){
                    return wordB;
                } else if (wordB.charAt(i)>wordA.charAt(i)) {
                    return wordA;
                } else {
                    continue;
                }
            }
            return wordA;
        }

        if (wordA.length()==wordB.length()) {
            for (int i = 0; i < wordA.length(); i++) {
                if (wordA.charAt(i)>wordB.charAt(i)){
                    return wordB;
                } else if (wordB.charAt(i)>wordA.charAt(i)) {
                    return wordA;
                } else {
                    continue;
                }
            }
        }
      return "null";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the names : ");
        String wordA = input.nextLine();
        String wordB = input.nextLine();
        System.out.println(firstWord(wordA,wordB));

    }
}