package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int a;
        int a1 = 0;
        do{
            a = sc.nextInt();
            result = result+a;
            if (a ==0){
                a1++;
            }
            else{
                a1=0;
            };
        }while(a1!=2);
        System.out.println(result);
    }
}
