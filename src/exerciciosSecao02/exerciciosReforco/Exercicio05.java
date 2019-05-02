package exerciciosReforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of studentes: ");
		int numStudent = sc.nextInt();
		
		for(int i = 1; i <= numStudent; i++) {
			System.out.print("Student " + i + ": ");
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			
			double scoreFinal = score1 + score2 + score3;
			
			System.out.printf("Final score: %.2f%n", scoreFinal);
			
		}
		sc.close();
	}

}
