package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i=0;i<100;i++){
            int a = sc.nextInt();
            result +=a;
        }
        System.out.println(result);
    }
}
