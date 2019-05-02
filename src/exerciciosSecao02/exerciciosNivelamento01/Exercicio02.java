package exerciciosNivelamento01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double raio, area;
		double pi = 3.14159;

		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("%.4f%n",area);
		
		sc.close();

	}

}
