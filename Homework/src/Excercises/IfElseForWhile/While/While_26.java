package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 1, resultmax = 1;
        int a1,a2,a3;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        do{
            if (a2>a3 && a2>a1){
                if (result<resultmax){
                    resultmax = result;
                }
                result = 1;

            }
            else{
                result ++;
            }
            a1 = a2;
            a2 = a3;
            a3 = sc.nextInt();
        }
        while(a3!=0);
        System.out.println(result);
    }
}
