package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cntSpace = 0, cntLetter = 0, cntOthers = 0, cntDigit = 0;
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i = 0; i < str.length(); ++i) {
            if(Character.isLetter(str.charAt(i))) cntLetter++;
            else if(Character.isDigit((str.charAt(i)))) cntDigit++;
            else if(str.charAt(i) == ' ') cntSpace++;
            else cntOthers++;
        }
        System.out.printf("letter: %d\n space: %d\n number: %d\n others: %d", cntLetter, cntSpace, cntDigit, cntOthers);
    }
}