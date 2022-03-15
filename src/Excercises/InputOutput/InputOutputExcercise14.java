package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise14 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int price = (a * 100 + b) * n;

        System.out.printf("%d.%02d\n", (int)Math.floor(price / 100), price % 100);
	}

}
