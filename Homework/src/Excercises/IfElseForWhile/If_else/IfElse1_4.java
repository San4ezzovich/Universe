package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>0){
            System.out.println("sign(x) = 1");
        }
        else if (x==0){
            System.out.println("sign(x) = 0");
        }
        else if (x<1){
            System.out.println("sign(x) = -1");
        }
        else{
            System.out.println("Error.Return");
            return;
        }
    }
}
