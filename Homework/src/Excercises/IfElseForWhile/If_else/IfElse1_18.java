package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result;
        if (n<=k){
            result = 2*m;
        }
        else if (n*2%k==0){
            result = m*(n*2/k);
        }
        else{
            result = m*(1+(n*2/k));
        }
        System.out.println(result);
    }
}
