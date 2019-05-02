package exerciciosNivelamento02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorIR = 0.00;
				
		double salario = sc.nextDouble();
		
		if(salario == 0 && salario <= 2000.00 ) {
			valorIR = 0.00; 
		}else if(salario > 2000.00 && salario <= 3000.00) {
			valorIR =  (salario - 2000.00) * 0.08;
		}else if(salario > 3000.00 && salario <= 4500.00) {
			valorIR += (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		}else if(salario > 4500.00) {
			valorIR += (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		
		if (valorIR == 0.00) {
			System.out.printf("Isento");
		}else {
			System.out.printf("R$ %.2f%n",valorIR);
		}
		
		sc.close();

	}

}
