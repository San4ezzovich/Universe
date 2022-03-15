package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise17 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = (n - (k % n)) % n;
        System.out.println(result);
	}
}
