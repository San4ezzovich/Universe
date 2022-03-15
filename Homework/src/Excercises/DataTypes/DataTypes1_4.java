package Excercises.DataTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.Collectors;
public class DataTypes1_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Point> points = getPointsArray();
		int num = scan.nextInt();
		if (num > 100) {
			System.out.println("Can`t be bigger than 100");
			return;
		}
		for (int i = 0; i < num; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x >= 103 || y >= 103) {
				System.out.println("Can`t be bigger than 103");
				return;
			}
			if (x <= -103 || y <= -103) {
				System.out.println("Can`t be smaller than 103");
				return;
			}
			points.add(new Point(x, y));
		}
		List<Point> sorted = points.stream().sorted(Comparator.comparing(DataTypes1_4::calculateDistance)).collect(Collectors.toList());

		sorted.forEach(System.out::println);


	}
	public static List<Point> getPointsArray () {
		List<Point> points = new ArrayList<>();
		return points;
	}
	public static double calculateDistance(Point points) {
		return Math.sqrt(Math.pow(points.x(), 2) + Math.pow(points.y(), 2));
	}
}
