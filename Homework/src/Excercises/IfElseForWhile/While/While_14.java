package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float result = 0, result1=0;
        int a1=1;
        do{
            int a = sc.nextInt();
            result+=a;
            result1++;
            a1 = a;
        }
        while(a1!=0);

        result = result/(result1-1);
        System.out.println(result);
    }
}