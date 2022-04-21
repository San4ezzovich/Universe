package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>2){
            n = n/2;
        }
        if(n%2==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
