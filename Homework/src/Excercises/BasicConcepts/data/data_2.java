package Excercises.BasicConcepts.data;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class data_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        Set<Integer> Nums = new HashSet<>();
        for(int i = 0;i<n;i++){
            String a = sc.next();
            if (a.equals("ADD")){
                b = sc.nextInt();
                Nums.add(b);
            }
            if (a.equals("PRESENT")){
                b = sc.nextInt();
                if (Nums.contains(b)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            if (a.equals("COUNT")){
                System.out.println(Nums.size());
            }
            else{
                System.out.println("UNKNOWN COMMAND. RETURN");
                return;
            }
        }
    }
}
