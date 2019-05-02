package exerciciosSecao03.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosSecao03.entities.Student;

public class ProgramEx03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if(student.finalGrade() >= 60.00) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		sc.close();
		
		
		
		
		
			
			

	}

}
