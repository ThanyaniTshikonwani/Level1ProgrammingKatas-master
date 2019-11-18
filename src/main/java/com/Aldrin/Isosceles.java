package com.Aldrin;
import java.util.Scanner;

public class    Isosceles {
    public void isosceles() {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter your desired size of an Isosceles triangle: ");
        int size =  user_input.nextInt();

//        for (int i = 1; i <= size; i++){
//            for (int j=size; j>i; j--) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k <= (i * 2) - 1; k++) {
//                    System.out.print("#");
//            }
//            System.out.println();
//        }

        int i = 1;
        while (i <= size) {
            int    j = size;
            while (j > i) {
                System.out.print(" ");
                j--;
            }

            int    k = 1;
            while (k <= (i*2)-1) {
                System.out.print("#");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
