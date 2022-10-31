package lec2;

import java.util.Scanner;

public class PracticeA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000: ");

        int number = input.nextInt();

        int a = number / 100;
        if (a == 0) a = 1;
        int b = (number%100) / 10;
        if (b == 0) b = 1;
        int c = number % 10;
        System.out.println("The multiplication of all digit in " + number + " is " + a*b*c);
    }
}
