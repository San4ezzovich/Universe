package Excercises.IfElseForWhile.While;
import java.util.Scanner;

public class While_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int prew=1, tmp=1,cur= 1, i=0;
        while(i<(element-2)){
            tmp = prew +cur;
            prew = cur;
            cur = tmp;
            i++;
        }
        System.out.println(cur);

    }
}
