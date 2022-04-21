package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        while(x<y){
            x +=x*0.1;
            result++;
        }
        System.out.println(result);
    }
}
