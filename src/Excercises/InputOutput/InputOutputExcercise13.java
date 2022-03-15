package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise13 {
	public static  void main (String[]args) {
		 Scanner sc = new Scanner(System.in);

	        int num = sc.nextInt();
	        if (num < 1 || num > 10) {
	            System.out.println("Incorrect value. Return.");
	            return;
	        }

	        int time = 9 * 60;
	        time += num * 45;
	        time += (Math.ceil(num / 2f) - num % 2) * 5;
	        time += (Math.ceil(num / 2f) - 1) * 15;

	        int hour = (int) (Math.floor(time / 60) % 24);
	        int minute = time % 60;

	        System.out.println(hour + " " + minute);
	}
}
