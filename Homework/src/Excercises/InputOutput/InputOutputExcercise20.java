package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise20 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Boolean result = n % m == 0;

        System.out.println(result.compareTo(false));
	}

}
