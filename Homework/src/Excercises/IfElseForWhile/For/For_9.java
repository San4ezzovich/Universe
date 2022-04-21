package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(float i=a;i<=b;i++){
            if(Math.sqrt(i)%1==0){
                System.out.println(i);
            }
        }
    }
}
