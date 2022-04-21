package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0){
            System.out.println(0);
        }
        else {
            int fib_prev = 0;
            int fib_next = 1;
            int fib_middle = 0;
            int n = 1;
            while (fib_next <= a) {
                fib_middle = fib_prev;
                fib_prev = fib_next;
                fib_next = fib_middle +fib_next;
                n++;
                if (fib_next == a) {
                    System.out.println(n);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}
