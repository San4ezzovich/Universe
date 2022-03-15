package Excercises.DataTypes;
import java.util.Scanner;
public class DataTypes2_6 {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a: ");
		float a = Float.parseFloat(sc.next());
		if (a > 10) {
			System.out.println("a must be lower than 10. Return;");
			return;
		}

		System.out.print("b: ");
		float b = Float.parseFloat(sc.next());
		if (a > 10) {
			System.out.println("a must be lower than 10. Return;");
			return;
		}

		System.out.print("c: ");
		float c = Float.parseFloat(sc.next());
		if (a > 10) {
			System.out.println("a must be lower than 10. Return;");
			return;
		}

		System.out.println(a + b == c ? "YES" : "NO");
	}

}
