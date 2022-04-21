package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a1,a2,a3;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        do{
            if (a2>a3 && a2>a1){
                result++;
            }
            a1 = a2;
            a2 = a3;
            a3 = sc.nextInt();
        }
        while(a1!=0 || a2!=0 || a3!=0);
        System.out.println(result);
    }
}
