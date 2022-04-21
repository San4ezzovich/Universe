package Excercises.IfElseForWhile.While;
import java.util.Scanner;
public class While_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (n>=i){
            if (Math.sqrt(i)%1==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
