package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise10 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hours = (int) (Math.floor(n / 60) % 24);
        int minutes = n % 60;

        System.out.println(hours + ":" + minutes);
    }
	}

