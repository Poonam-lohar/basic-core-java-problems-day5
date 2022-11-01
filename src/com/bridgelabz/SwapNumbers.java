package com.bridgelabz;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int first = sc.nextInt();
        System.out.println("enter 2nd number : ");
        int second = sc.nextInt();
        System.out.println(": Before swap :");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        int temporary = first;
        first = second;
        second = temporary;
        System.out.println(": After swap :");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
