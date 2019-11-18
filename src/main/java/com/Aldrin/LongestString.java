package com.Aldrin;
import java.util.Scanner;

public class LongestString {

    public void  longestString() {

        Scanner input = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Enter 5 Strings: ");

        int i = 0;
         while (i < array.length){
             array[i] = input.nextLine();
             i++;
         }
        String longerString = stringCheck(array);
        System.out.format("long Str: '%s'\n", longerString);
    }


    public  static  String  stringCheck(String[] array){
        int maxl = 0;
        String longerString = null;
        for (String s : array){
            if (s.length() > maxl){
                maxl = s.length();
                longerString = s ;
            }
        }
        return longerString;
    }
}
