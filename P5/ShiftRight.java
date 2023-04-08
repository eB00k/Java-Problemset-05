package org.example.P5;


import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[1000];
        System.out.println("Enter your numbers, press return to end.");
        String str = in.nextLine();
        int i = 0;
        while (!str.equals("")) {
            try {
                nums[i++] = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Not a legal number. Try again!");
                i--;
            }
            str = in.nextLine();
        }
        System.out.println("Enter N:");
        int shift = Integer.parseInt(in.nextLine().trim());
        for (int j = 0; j < i; j++) {
            System.out.print(nums[((j - shift) % i + i) % i] + " ");
        }
    }
}
