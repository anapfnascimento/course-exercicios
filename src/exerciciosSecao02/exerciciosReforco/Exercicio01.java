package exerciciosReforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three student scores: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2 + nota3;
		
		System.out.printf("Final score = %.2f%n", notaFinal);
		
		if (notaFinal < 60.00) {
			System.out.println("FAILED");
		}
		
		sc.close();

	}

}
