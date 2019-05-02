package exerciciosNivelamento01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, numHoras;
		double vlrHora, salario;
		
		numFuncionario = sc.nextInt();
		numHoras = sc.nextInt();
		vlrHora = sc.nextDouble();
		
		salario = numHoras * vlrHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
