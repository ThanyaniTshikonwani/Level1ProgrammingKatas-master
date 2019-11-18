package com.Aldrin;
import java.util.Scanner;

public class    CombineArraysLists {
    public void combinearrayslists() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 sets of integer arrays, start by their identical length: ");
        int len = input.nextInt();
        //System.out.println();

        int [] array1 = new int[len];
        int [] array2 = new int[len];
        int [] comb   = new int[len*2];

        System.out.print("Now enter array list 1: ");
        System.out.println();

        int i = 0;
        while (i <= len-1) {
            array1[i++] = input.nextInt();
        }
        System.out.println();

        System.out.print("Enter array list 2: ");
        System.out.println();

        i = 0;
        while (i <= len-1) {
            array2[i++] = input.nextInt();
        }

        i = 0;
        int j = 0;
        int k = 0;
        while (i <= (len*2)-1) {
            while (j <= len-1) {
                comb[i++] = array1[j++];
                break;
            }
            while (k <= len-1) {
                comb[i++] = array2[k++];
                break;
            }
        }

        System.out.println();
        System.out.println("Here is the list of your arrays combined into one:-");
        System.out.print("'");
        i = 0;
        while (i <= (len*2)-1) {
            System.out.print(comb[i++]);
            if (i <= (len*2)-1)
                System.out.print(",");
            else
                break;
                //System.out.print(".");
        }
        System.out.print("'");
        System.out.println();
    }
}
