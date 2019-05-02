package exerciciosReforco;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter two integer numbers: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n2 < n1) {
			int aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		while(n1 <= n2) {
			if(n1 % 2 != 0 ) {
				sum += n1; 
			}
			n1++;
		}
		
		System.out.println("Sum of odd numbers = " + sum);
		
		sc.close();
	}

}
