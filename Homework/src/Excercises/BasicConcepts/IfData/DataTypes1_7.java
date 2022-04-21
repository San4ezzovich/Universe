package Excercises.BasicConcepts.IfData;

import Excercises.DataTypes.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataTypes1_7 {
	public static void main(String[]  args) {
			List<Student> students = getStudentsArray();
			if (students == null) return;
			double resultMath = students.stream().map(Student::math).reduce(Integer::sum).get() / students.size();
			double resultPhysic = students.stream().map(Student::physic).reduce(Integer::sum).get() / students.size();
			double resultInformatic = students.stream().map(Student::informatic).reduce(Integer::sum).get() / students.size();
			System.out.println(resultMath + "  " + resultPhysic + "  " + resultInformatic);
		}
	public static List<Student> getStudentsArray() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		int countOfStudents = sc.nextInt();
		if (countOfStudents <= 0) {
			return null;
		}
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < countOfStudents; i++) {
			Student student = getStudent(sc);

			if (student != null) {
				students.add(student);
			} else {
				return null;
			}
		}
		System.out.println();
		for (int i = 0; i<countOfStudents;i++){
			System.out.println(students.get(i));
		}
		return students;
	}
	public static Student getStudent(Scanner sc) {
		String str = sc.next();
		String[] split = str.split(" ");

		if (split.length != 5) {
			return null;
		}
		String firstName = split[0];
		String lastName = split[1];
		int mathScore = Integer.parseInt(split[2]);
		int physicsScore = Integer.parseInt(split[3]);
		int informaticsScore = Integer.parseInt(split[4]);
		if (mathScore > 5 || mathScore < 1) {
			return null;
		}
		if (physicsScore > 5 || physicsScore < 1) {
			return null;
		}
		if (informaticsScore > 5 || informaticsScore < 1) {
			return null;
		}
		return new Student(firstName, lastName, mathScore, physicsScore, informaticsScore);
	}
}