package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days ?");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("The month 2 is has 28 or 29 days!");
                break;
            case 1, 3, 5,7,8,10,12:

                System.out.println("The month " + month + "has 31 days!");
                break;
            case  4,6,9,11:

                System.out.println("The month" + month + " has a 30 days!");
                break;
            default:
                System.out.println("Invalid input!");
        }

    }
}
