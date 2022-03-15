package Excercises.DataTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataTypes1_3 {
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		List<Point> points = getPointsArray();
		double Answer = 0;
		double result;
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
			for(int j = 0; j<num;j++){
				result = Math.sqrt((Math.pow((points.get(i).x()-points.get(j).x()),2)+Math.pow((points.get(i).x()-points.get(j).x()),2) ));
				if (result > Answer){
					Answer=result ;
				}
			}
		}
		System.out.printf("Answer = %.15f", Answer);

	}
	public static List<Point> getPointsArray() {
		List<Point> points = new ArrayList<>();
		return points;
	}

}
