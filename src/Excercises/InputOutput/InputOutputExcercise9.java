package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise9 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num + 2 - num % 2);
	}
	
}
