
package Classwork1;
import java.util.Scanner;
public class Classwork1_3 {
	public static void main(String[]args) {
		System.out.println("Введите Ваше имя и нажмите:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Привет, " + name);
		scan.close();
	}
}
