package lec3;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 2*number-(2*i-1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
