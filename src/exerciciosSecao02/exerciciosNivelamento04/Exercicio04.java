package exerciciosNivelamento04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			int vlr1  = sc.nextInt();
			int vlr2 = sc.nextInt();
			
			if(vlr2 == 0) {
				System.out.println("divisao impossivel");
			}else {
				double resultado = (double) vlr1 / vlr2;
				System.out.printf("%.1f%n", resultado);
			}
		}
		sc.close();

	}

}
