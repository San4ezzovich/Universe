package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a;
        do{
            a = sc.nextInt();
            result+=a;
        }while(a!=0);
        System.out.println(result);
    }
}
