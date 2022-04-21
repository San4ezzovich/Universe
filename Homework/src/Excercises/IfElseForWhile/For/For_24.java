package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int result = 0;
        if(n<=0 || n>100) return;
        for (int i=1;i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.println(i);
                result++;
                if (result>=n){
                    return;
                }
            }
        }

    }
}
