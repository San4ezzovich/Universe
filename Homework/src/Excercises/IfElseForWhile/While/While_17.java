package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a, amax= 0;
        do{
            a = sc.nextInt();
            if (a>amax){
                amax = a;
                result++;
            }
        }while(a!=0);
        System.out.println(result-1);
    }
}
