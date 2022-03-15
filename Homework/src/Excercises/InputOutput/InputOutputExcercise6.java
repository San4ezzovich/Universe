package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise6 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (Math.abs(num) > 99) {
            System.out.println("Incorrect value. Return.");
            return;
        }

        System.out.println(Math.floor(num / 10));
	}
}
	
