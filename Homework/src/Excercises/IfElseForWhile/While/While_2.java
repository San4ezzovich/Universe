package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float i = 2;
        do{
            if((n/i)%1==0) {
                System.out.println((n/i)%1f);
                System.out.println(i);
                return;
            }
            i++;
        }
        while (true);

    }
}
