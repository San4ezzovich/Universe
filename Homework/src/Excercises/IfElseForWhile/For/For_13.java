package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (2>x || x>300){
            return;
        }
        for (int i=2; i<=x;i++){
            if(x%i==0){
                System.out.println(i);
                return;
            }
        }
    }
}
