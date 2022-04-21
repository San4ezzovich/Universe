package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Число корів не може бути від'ємним.");
            return;
        }
        if (n%10==1){
            System.out.println("На лузі пасеться "+ n + " корова");
        }
        else if(n%10>1 && n%10<5 ){
            if (n>11 && n<15){
                System.out.println("На лузі пасеться "+ n + " корів");
                return;
            }

            System.out.println("На лузі пасеться "+ n + " корови");
        }
        else{
            System.out.println("На лузі пасеться "+ n + " корів");
        }
    }
}
