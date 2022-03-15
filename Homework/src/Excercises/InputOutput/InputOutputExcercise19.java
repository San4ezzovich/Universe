package Excercises.InputOutput;
import java.util.Scanner;
public class InputOutputExcercise19 {
	public static  void main (String[]args) {
		Scanner sc = new Scanner(System.in);
        String str = String.format("%04d", sc.nextInt());
        Boolean result = str.charAt(0) == str.charAt(3) && str.charAt(1) == str.charAt(2);
        System.out.println(result.compareTo(false));
	}
}
