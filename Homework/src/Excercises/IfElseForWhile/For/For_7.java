package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a<=b) {
            if (a%2!=0){
                a+=1;
            }
            System.out.println(a);
            a+=2;
        }


    }
}
