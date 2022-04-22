package Emoji;
import java.util.*;
public class Emoji {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*Юнікод кодировка смайликів, які записані до масиву.*/
        /*https://unicode-table.com/ru/sets/emoji/ - сайт який використовував для смайликів*/
        int [] array = new int []{128533,9786,9785,128512,128514,128520};
        System.out.println("Input num from 0 to "+ (array.length-1));
        /*Вводимо індекс за допомогою якого виводимо смайлик з масиву*/
        int num = sc.nextInt();
        /*Перевіряємо вийнятки*/
        if(num<0 || num>array.length){
            System.out.println("Incorect value. Return.");
            return;
        }
        /*Виводимо смайлик, конвертуючи його в інший тип данних*/
        System.out.print(Character.toString(array[num]));
    }
}
