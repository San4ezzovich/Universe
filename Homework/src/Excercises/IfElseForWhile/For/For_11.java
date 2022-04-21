package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0, x1=0;
        while (x>0){
            x1 = x%10;
            result +=x1;
            x/=10;
        }
        System.out.println(result);
    }
}
