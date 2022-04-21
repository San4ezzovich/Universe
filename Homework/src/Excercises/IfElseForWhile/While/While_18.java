package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a, amax= 0,amax2 = 0;
        do{
            a = sc.nextInt();
            if (a>amax){
                amax2 = amax;
                amax = a;
            }
        }while(a!=0);
        System.out.println(amax2);
    }
}
