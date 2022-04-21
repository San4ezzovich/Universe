package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 1;
        int a;
        int a1 = 0;
        do{
            a = sc.nextInt();
            if (a ==0) break;
            if(a==a1){
                result++;
            }
            else{
                result = 1;
            }
            a1 = a;
        }while(a!=0);
        System.out.println(result);
    }
}
