package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 1;
        int a, amax= 0;
        do{
            a = sc.nextInt();
            if (a>=amax){
                if (a ==amax){
                    result++;
                }


                amax = a;
            }
        }while(a!=0);
        System.out.println(result);
    }
}
