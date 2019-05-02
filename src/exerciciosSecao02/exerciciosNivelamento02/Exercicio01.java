package exerciciosNivelamento02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		if(a < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();


	}

}
