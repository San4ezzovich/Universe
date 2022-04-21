package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<=0){
            return;
        }
        if (((num+4)/4)%1==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
