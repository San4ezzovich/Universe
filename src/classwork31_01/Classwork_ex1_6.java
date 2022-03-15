package classwork31_01;

public class Classwork_ex1_6 {
	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("Перед тим як передати значення аргументів a = "+ a + " та b = " +b );
		swapFunction(a, b);
		System.out.println("\nЗараз, до та після передачі значення аргументів ");
		System.out.println("залишилися незмінними, a=" + a + " i b="+b);
	}
	public static void swapFunction(int a, int b) {
		System.out.println("До заміни: a = " +a+" b = "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("Після заміни: a = "+ a + " b = "+b);
	}
	

}
