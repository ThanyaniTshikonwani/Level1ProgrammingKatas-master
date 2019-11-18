package com.Aldrin;
import java.util.Scanner;

public class    FrameaText {
    public void frameatext() {

        Scanner input = new Scanner(System.in);
        System.out.print("Populate an array with strings, start by determining its size: ");
        int size = input.nextInt();

        String[] array = new String[size];
        System.out.println();
        System.out.print("Now enter your strings and press 'ENTER': ");
        System.out.println();
        try {
            int i = 0;
            while (i <= size - 1) {
                array[i++] = input.next();
            }
            System.out.println();

            int maxl = 0;
            for (String s : array) {
                if (s.length() > maxl) {
                    maxl = s.length();
                }
            }

            i = 0;
            while (i++ <= maxl + 3) {
                System.out.print("*");
            }
            System.out.println();

            int j = maxl + 1;
            i = 0;
            while (i <= size - 1) {
                System.out.print("*");
                System.out.print(" ");
                System.out.print(array[i]);

                int k = array[i].length();
                while (k++ <= j) {
                    System.out.print(" ");
                    if (k == j) {
                        System.out.print("*");
                    }
                }
                i++;
                System.out.println();
            }

            i = 0;
            while (i++ <= maxl + 3) {
                System.out.print("*");
            }


        } catch (Exception e) {
            System.out.println("Please enter Int for Size and Strings for arrays. Presa enter when you done");
        }

    }
}

