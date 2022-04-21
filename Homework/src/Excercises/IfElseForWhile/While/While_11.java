package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int a1 = 0, b1 = 0;
        int score = 0;
        if (a<=0 || b<=0){
            return;
        }while(a1!=n && b1 !=n) {
            if (a1 == 0){
                System.out.println(">a");
                System.out.println(a1+"  "+b1);
                a1 = a;
            }
            System.out.println("a>b");
            System.out.println(a1+"  "+b1);
            b1 += a1;
            a1 = 0;
            if (b1>b){
                a1 = b1-b;
                b1 = b;
            }
            if (b1==b){
                System.out.println("b>");
                System.out.println(a1+"  "+b1);
                b1 = 0;
            }
            if(a1==a||b1!=b){

            }
            if (a1==a && b1 ==b){
                System.out.println("inf");
                System.out.println(a+"  "+b);
                return;
            }
            score ++;
            if (score>105) return;

        }

    }
}
