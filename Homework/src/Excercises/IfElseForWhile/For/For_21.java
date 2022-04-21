package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0;i<m;i++){
            int k = sc.nextInt();
            if (k==0){
                System.out.println("YES");
                return;
            }
        }
    }
}
