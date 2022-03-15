package Excercises.InputOutput;

import java.util.Scanner;

public class InputOutputExcercise1 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (Math.abs(a) > 1000 || Math.abs(b) > 1000) {
            System.out.println("Incorrect value.");
            return;
        }

        System.out.println("Ex1\n -Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
	
}
 