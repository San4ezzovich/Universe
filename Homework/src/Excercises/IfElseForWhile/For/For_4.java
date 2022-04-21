package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float result = 1;
        if (n<=0 || n>12){
            return;
        }
        for (int i=1;i<=n;i++){
            int n1=1;
             for(int j=1;j<=i;j++){
                 n1 =n1*j;
             }
            result = result + 1f/n1;
        }
        System.out.println(result);
    }
}
