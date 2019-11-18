package com.Aldrin;
import java.util.Scanner;

public class    Hello {
    public void hello() {

        Scanner user_input = new Scanner( System.in );
        String  name;
        System.out.print("Please enter your name: ");
        name = user_input.next();
        System.out.println("Hello!! " + name);
    }
}
