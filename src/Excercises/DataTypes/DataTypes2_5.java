package Excercises.DataTypes;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DataTypes2_5 {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");

		System.out.print("Enter numbers: ");
		String str = sc.next();

		Set<Integer> nums = new HashSet<>();
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			int num = Integer.parseInt(split[i]);
			System.out.println(nums.contains(num) ? "YES" : "NO");
			nums.add(num);
		}
	}

}
