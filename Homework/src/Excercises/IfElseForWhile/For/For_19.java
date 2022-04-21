package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int result = 0;
        for (int i = 0;i<m;i++){
            int k = sc.nextInt();
            if (k==0){
                result +=1;
            }
        }
        System.out.println(result);
    }
}
