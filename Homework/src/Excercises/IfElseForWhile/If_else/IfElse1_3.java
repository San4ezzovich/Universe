package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<=1000 || num>9999){
            System.out.println("Must be 4 numbs. Return.");
            return;
        }
        int isTrue = sc.nextInt();
        int a = num/1000;
        int b = (num/100)%10;
        int c = (num/10)%10;
        int d = num%10;
        if (isTrue ==1) {
            if (a == d && b == c) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            if (a == d && b == c) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}