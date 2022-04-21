package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a, amax= 0;
        do{
            a = sc.nextInt();
            if (a>amax){
                amax = a;
            }
        }while(a!=0);
        System.out.println(amax);
    }
}
