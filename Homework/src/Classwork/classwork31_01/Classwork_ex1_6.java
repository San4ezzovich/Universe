package Classwork.classwork31_01;

public class Classwork_ex1_6 {
	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("����� ��� �� �������� �������� ��������� a = "+ a + " �� b = " +b );
		swapFunction(a, b);
		System.out.println("\n�����, �� �� ���� �������� �������� ��������� ");
		System.out.println("���������� ���������, a=" + a + " i b="+b);
	}
	public static void swapFunction(int a, int b) {
		System.out.println("�� �����: a = " +a+" b = "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("ϳ��� �����: a = "+ a + " b = "+b);
	}
	

}
