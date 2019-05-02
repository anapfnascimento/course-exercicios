package exerciciosReforco;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		do {
			System.out.println("Enter an integer value: ");
			n1 = sc.nextInt();
			if(n1 != 0) {
				System.out.println(n1 * n1);
			}

		}while(n1 != 0);
		
		
		sc.close();

	}

}
