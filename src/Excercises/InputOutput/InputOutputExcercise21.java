package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise21 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int t = Integer.parseInt(String.valueOf(Integer.toBinaryString((a - b) >> 31).charAt(0)));

        int max = a * (1 - t) + b * t;

        System.out.println(max);
	}
}
