package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        if (2>x || x>300){
            return;
        }
        for (int i=1; i<=x;i++){
            if(x%i==0){
                result +=1;
            }
        }
        System.out.println(result);
    }
}
