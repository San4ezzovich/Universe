package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int result1 = 0, result2 = 0, result3 = 0;
        for (int i = 0;i<m;i++){
            int k = sc.nextInt();
            if (k==0){
                result1 +=1;
            }
            else if (k<0){
                result2 +=1;
            }
            else {
                result3+=1;
            }

        }
        System.out.println(result1+"    "+result2+"     "+result3);
    }
}
