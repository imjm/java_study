package lec2;

import java.util.Scanner;

public class PracticeB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges (length in double): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("The perimeter is " + (a + b + c));
        } else {
            System.out.println("Input is invalid");
        }
    }
}
