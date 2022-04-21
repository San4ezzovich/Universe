package Excercises.BasicConcepts.IfData;
import Excercises.DataTypes.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataTypes1_6 {
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		List<Point> points = getPointsArray();
		int num = scan.nextInt();
		if (num>100){
			System.out.println("Can`t be bigger than 100");
			return;
		}
		for (int i=0;i<num;i++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x>=103  || y>=103){
				System.out.println("Can`t be bigger than 103");
				return;
			}
			if (x<=-103  || y<=-103){
				System.out.println("Can`t be smaller than 103");
				return;
			}
			points.add(new Point(x,y));
		}
		double maxSquare = 0;
		for (Point point1 : points) {
			for (Point point2 : points) {
				if (point2.equals(point1)) {
					continue;
				}
				for (Point point3 : points) {
					if (point3.equals(point2) || point3.equals(point1)) {
						continue;
					}

					// Find square of triangle
					double a = calculateDistance(point1, point2);
					double b = calculateDistance(point2, point3);
					double c = calculateDistance(point3, point1);
					double s = (a + b + c) / 2;
					double square = Math.sqrt(s * (s - a) * (s - b) * (s - c));

					if (square > maxSquare) maxSquare = square;
				}
			}
		}

		System.out.printf("%.15f",maxSquare);
	}


	public static List<Point> getPointsArray() {
		List<Point> points = new ArrayList<>();
		return points;
	}
	public static double calculateDistance(Point point1, Point point2) {
		double x = Math.abs(point1.x() - point2.x());
		double y = Math.abs(point1.y() - point2.y());
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}
