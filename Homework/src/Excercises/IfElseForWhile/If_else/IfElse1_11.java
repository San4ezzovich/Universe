package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Frist point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        if (x1 <0 || x1 >8){
            return;
        }
        if (y1 <0 || y1 >8){
            return;
        }
        System.out.println("Second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (x2 <0 || x2 >8){
            return;
        }
        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);

        if (dx ==1 && dy ==2){
            System.out.println("YES");
        }
        else if(dx ==2 && dy ==1){
            System.out.println("YES");
        }
        else System.out.println("NO");


    }
}
