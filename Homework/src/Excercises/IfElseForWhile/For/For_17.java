package Excercises.IfElseForWhile.For;
import java.util.Scanner;


public class For_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            result +=a;
        }
        System.out.println(result);
    }
}
