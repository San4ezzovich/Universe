package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        do{
            if(Math.pow(2,i)<=n){
                System.out.println(Math.pow(2,i));
            }

            i++;
        }while(Math.pow(2,i)<=n);

    }
}
