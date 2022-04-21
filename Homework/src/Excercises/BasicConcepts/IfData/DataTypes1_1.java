package Excercises.BasicConcepts.IfData;
import java.util.Scanner;
public class DataTypes1_1 {
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		int answ = 0;
		double result = 0; 
		int num = scan.nextInt();
		int [][] arr = new int[num][2];
		for(int i = 0; i<num;i++){
				int x = scan.nextInt();
				int y = scan.nextInt();
				if (x>=103 || y>=103) {
					System.out.print("Can`t be bigger than 103");
					return;
				}
				arr[i][0] = x;
				arr[i][1] = y;
			}
		System.out.println("\nAnswer: \n");
	for(int i = 0; i<num;i++) {
		
		
		double count = Math.sqrt (arr[i][0]* arr[i][0] + arr[i][1]* arr[i][1]);
		
		if (count >result) {
			result = count;
			answ = i;
		}
	}	
		for(int j = 0; j<2;j++) {
			System.out.print(arr[answ][j]+ " ");
	}
}
}
