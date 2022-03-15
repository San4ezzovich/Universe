package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise15 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("First:");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt() % 60;
        int s1 = sc.nextInt() % 60;

        System.out.println("Second");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt() % 60;
        int s2 = sc.nextInt() % 60;

        int dif = (s2 + (m2 * 60) + (h2 * 3600)) - (s1 + (m1 * 60) + (h1 * 3600));

        if (dif < 0) {
            System.out.println("The second earlier than the first.");
            return;
        }

        System.out.println(dif);
	}
}
