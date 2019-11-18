package com.Aldrin;
import java.util.Scanner;

public class    Square {
    public void square () {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter your desired size of the square: ");
        int size = user_input.nextInt();

        int i = 1;
        while (i <= size) {
            int j = 1;
            while (j <= size) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
