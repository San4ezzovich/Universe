package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max,n = 0,kmax;
        max=-1;
        kmax=1;
        do
        {
            n = sc.nextInt();
            if (n>max)
            {
                max=n;
                kmax=1;
            }
            else if (n==max) kmax++;

        }while (n!=0);
        System.out.println(kmax);


    }
}
