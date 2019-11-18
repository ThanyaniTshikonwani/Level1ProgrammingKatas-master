package com.Aldrin;
import java.util.Scanner;

public class    Parity {
    public void parity() {

        Scanner user_input = new Scanner( System.in );
        System.out.print("Please enter an interger between 1 & 127: ");
        int num = user_input.nextInt();

        if (num%2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
    }
}
