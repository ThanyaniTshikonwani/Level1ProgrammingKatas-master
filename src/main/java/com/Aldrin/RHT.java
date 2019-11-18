package com.Aldrin;
import java.util.Scanner;

public class    RHT {
    public void rightHT() {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter your desired size of the Right Handed Triangle: ");
        int size = user_input.nextInt();

        int i = 1;
        while (i <= size) {
            int k = 1;
            while (k <= i) {
                System.out.print("#");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
