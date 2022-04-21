package Classwork.Classwork1;

public class Classwork1_1 {
	public static void main(String[] args) {
		String s1, s2; s1 = "Java"; s2=s1;
		System.out.println("����������� ������ "+ (s1==s2));
		s2 = new String("Java");
		s2 = new String(s1);
		System.out.println("����������� ������ "+ (s1==s2));
		System.out.println("����������� �������� "+ s1.equals(s2));
	}
}
