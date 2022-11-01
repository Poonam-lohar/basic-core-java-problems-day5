package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int base = sc.nextInt();
        int x = 2;
        System.out.println("Power is " + power(base, x));
    }
    static int power(int base, int x) {
        if (x == 0)
            return 1;
        return (base * power(base,x - 1));

    }
}
