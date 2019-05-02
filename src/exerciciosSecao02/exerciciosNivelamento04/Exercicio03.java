package exerciciosNivelamento04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double vlr1 = sc.nextDouble();
			double vlr2 = sc.nextDouble();
			double vlr3 = sc.nextDouble();
			
			double media = (vlr1 * 2 + vlr2 * 3 + vlr3 * 5) / 10.0; 
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
