package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise18 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        float h = sc.nextInt();
        float a = sc.nextInt();
        float b = sc.nextInt();

        int result = (int) Math.ceil((h - a + (a - b)) / (a - b));
        System.out.println(result);
	}
}
