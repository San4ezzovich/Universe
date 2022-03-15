package Excercises.InputOutput;

import java.util.Scanner;

public class InputOutputExcercise2 {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (Math.abs(num) > 10000) {
            System.out.println("Incorrect value. Return.");
            return;
        }

        System.out.printf("The next number for the number %d is %d\n", num, num + 1);
        System.out.printf("The prev number for the number %d is %d", num, num - 1);
    }
}
