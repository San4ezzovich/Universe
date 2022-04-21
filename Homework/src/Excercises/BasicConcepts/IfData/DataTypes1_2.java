package Excercises.BasicConcepts.IfData;
import Excercises.DataTypes.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataTypes1_2 {
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
		for(int i = 0; i<num;i++){
			double answ = 0;
			answ = (points.get(i).x() + points.get(i).y())/2 ;
			System.out.printf("%.15f\n", answ);
		}
	}
	public static List<Point> getPointsArray() {
		List<Point> points = new ArrayList<>();
		return points;
	}

}
