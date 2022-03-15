package Excercises.DataTypes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DataTypes2_1 {
	public static void main(String[]  args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Set<Integer> nums = new HashSet<>();
			for (int i = 0; i < n; i++) {
				System.out.print((i + 1) + " ");
				nums.add(sc.nextInt());
			}
			System.out.println(nums.size());
		}
	}

