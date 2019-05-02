package exerciciosNivelamento01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double vlr1, vlr2, vlrTotal;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vlr2 = sc.nextDouble();
		
		vlrTotal = (qtd1 * vlr1) + (qtd2 * vlr2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vlrTotal);
		
		sc.close();
		
	}
}
