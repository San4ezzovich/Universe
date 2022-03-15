package Excercises.DataTypes;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class DataTypes2_4 {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");

		System.out.print("1: ");
		String str1 = sc.next();
		System.out.print("2: ");
		String str2 = sc.next();

		Set<Integer> nums1 = Arrays.stream(str1.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
		Set<Integer> nums2 = Arrays.stream(str2.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

		Set<Integer> sorted = nums1.stream().filter(nums2::contains).sorted().collect(Collectors.toSet());

		sorted.forEach(num -> System.out.print(num + " "));

	}

}
