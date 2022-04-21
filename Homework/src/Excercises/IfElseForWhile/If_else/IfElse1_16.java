package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = a -c;
        int f =  b - d;
        if (f<0){
            e =-1;
            if (b>9){
                f =+10;
            }
            else f =+1;
        }
        System.out.println(e + "." + f);

    }
}
