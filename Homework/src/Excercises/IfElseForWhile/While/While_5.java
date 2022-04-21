package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int result = 1,result1 = 0;
        while(a>result){
            result*=2;
            result1 +=1;
        }
        System.out.println(result1);
    }
}
