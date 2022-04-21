package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a;
        do{
            a = sc.nextInt();
            if (a%2==0){
                result++;
            }
        }while(a!=0);
        System.out.println(result-1);
    }
}
