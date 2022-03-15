package Excercises.DataTypes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DataTypes2_2 {
	public static void main(String[]  args) {

	Set<Integer> nums = new HashSet<>();
	Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
	int n = sc.nextInt();

	String[] commands = new String[n];
        for (int i = 0; i < n; i++) {
		commands[i] = sc.next().toLowerCase();
	}
        System.out.println();
        for (String command: commands) {
		String[] split = command.split(" ");

			switch (split[0]) {
				case "add":
					if (split.length > 1) {
						nums.add(Integer.parseInt(split[1]));
					}
					break;
				case "present":
					if (split.length > 1) {
						System.out.println(nums.contains(Integer.parseInt(split[1])) ? "YES" : "NO");
					}
					break;
				case "count":
					System.out.println(nums.size());
					break;
				default:
					System.out.println("Unknown command");
			}
		}
	}
}

