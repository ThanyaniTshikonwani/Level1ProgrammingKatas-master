package com.Aldrin;
import java.util.Scanner;

public class    Main {
    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter program number in the menu below: ");
        int num = input.nextInt();

        switch (num) {
//            case 1:
//                Hello greeting = new Hello();
//                greeting.hello();
//                break;
//
//            case 2:
//                Parity check = new Parity();
//                check.parity();
//                break;
//
//            case 3:
//                Square drawSquare =new Square();
//                drawSquare.square();
//                break;
//
//            case 4:
//                RHT drawtriangle = new RHT();
//                drawtriangle.rightHT();
//                break;
//
//            case 5:
//                Isosceles drawIsosceles = new Isosceles();
//                drawIsosceles.isosceles();
//                break;
//
//            case 6:
//                LongestString longcheck = new LongestString();
//                longcheck.longestString();
//                break;
//
//            case 7:
//                CombineArraysLists combine = new CombineArraysLists();
//                combine.combinearrayslists();
//                break;
            case 8:
                FrameaText frame = new FrameaText();
                frame.frameatext();
                break;
        }
    }
}
