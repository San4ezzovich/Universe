package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println(0);
            return;
        }
        else if (a<=b){
            System.out.println("a smaller than b");
            return;
        }
        else {
            while (a >= b) {
                if (a%2==0 && a/2>=b){
                    a/=2;
                    System.out.println(":2");
                }
                else if(a-1>=b){
                    a-=1;
                    System.out.println("-1");
                }
                else{
                    return;
                }
            }
        }
    }
}
