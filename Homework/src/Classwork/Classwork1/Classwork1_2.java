package Classwork.Classwork1;

public class Classwork1_2 {
	public static void main(String[]args) {
		int x;
		try {
			x = System.in.read();char c = (char)x;System.out.println("��� �������: "+c+"="+x);						
		}catch(java.io.IOException e) {
			System.err.println("������ ����� " + e);
			
		}
		
	}

}
