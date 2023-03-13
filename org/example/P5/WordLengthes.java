package org.example.P5;

import java.util.Scanner;

public class WordLengthes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[100];
        arr = in.nextLine().trim().split(" ");
        printResult(arr);
    }
    public static int wordLength(String word) {
        int cnt = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isLetter(word.charAt(i))) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void printResult(String[] arr) {
        int i = 1;
        for(String word: arr) {
            int len = wordLength(word);
            System.out.println((i++) + ": " + len + "\t" + "*".repeat(len));
        }
    }
}
