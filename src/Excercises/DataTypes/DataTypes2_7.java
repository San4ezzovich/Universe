package Excercises.DataTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class DataTypes2_7 {
	public static void main(String[]  args) {
		double x, y, z;
		double[] ai, bi, ci, qi;
		int n;

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");

		String[] xyz = sc.next().split(" ");
		if (xyz.length != 3) {
			System.out.println("Incorrect value. Return.");
			return;
		}

		x = Double.parseDouble(xyz[0]);
		y = Double.parseDouble(xyz[1]);
		z = Double.parseDouble(xyz[2]);

		n = sc.nextInt();

		ai = new double[n];
		bi = new double[n];
		ci = new double[n];
		qi = new double[n];
		for (int i = 0; i < n; i++) {
			String[] abcq = sc.next().split(" ");
			if (abcq.length != 4) {
				System.out.println("Incorrect value. Return.");
				return;
			}

			ai[i] = Double.parseDouble(abcq[0]);
			bi[i] = Double.parseDouble(abcq[1]);
			ci[i] = Double.parseDouble(abcq[2]);
			qi[i] = Double.parseDouble(abcq[3]);
		}

		double[] aiMultiply = new double[n];
		IntStream.range(0, n).forEach(i -> aiMultiply[i] = ai[i] * qi[i]);
		double aiResult = Arrays.stream(aiMultiply).sum();

		double[] biMultiply = new double[n];
		IntStream.range(0, n).forEach(i -> biMultiply[i] = bi[i] * qi[i]);
		double biResult = Arrays.stream(aiMultiply).sum();

		double[] ciMultiply = new double[n];
		IntStream.range(0, n).forEach(i -> ciMultiply[i] = ci[i] * qi[i]);
		double ciResult = Arrays.stream(aiMultiply).sum();

		System.out.println(aiResult >= x && biResult >= y && ciResult >= z ? "YES" : "NO");
	}

}
