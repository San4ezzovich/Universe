package Excercises.InputOutput;

import java.util.Scanner;

public class InputOutputExcercise3 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int k = sc.nextInt();

	        System.out.println(Math.floor(k / n));
	    }
}
