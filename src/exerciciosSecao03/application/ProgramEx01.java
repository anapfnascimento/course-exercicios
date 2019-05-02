package exerciciosSecao03.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosSecao03.entities.Rectangle;

public class ProgramEx01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", ret.Area());
		System.out.printf("PERIMETER = %.2f%n", ret.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", ret.Diagonal());
		
		sc.close();

	}

}
