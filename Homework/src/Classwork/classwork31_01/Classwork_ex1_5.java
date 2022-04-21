package Classwork.classwork31_01;

public class Classwork_ex1_5 {
	public String name;
	private double salary;
	public Classwork_ex1_5 (String empName) {
		name = empName;
	}
	public void setSalary(double empSal) {
		salary = empSal;
	}
	public void printEmp() {
		System.out.println("name: " + name );
		System.out.println("salary: " + salary );
	}
	public static void main(String args[]) {
		Classwork_ex1_5 empOne = new Classwork_ex1_5 ("Vasyl ");
		empOne.setSalary(1000);
		empOne.printEmp();
	}

}
