package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Frist point: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k<=0 || n<=0 || m<=0){
            return;
        }
        if ((k < n * m) && ((k % n == 0) || (k % m == 0))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
