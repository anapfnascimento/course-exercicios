package exerciciosNivelamento03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int totlAlcool = 0, totlGasolina = 0, totlDiesel = 0;
		
		while(combustivel != 4) {
			
			switch (combustivel) {
				case 1:
					totlAlcool++;
					break;
				case 2:
					totlGasolina++;
					break;
				case 3:
					totlDiesel++;
					break;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + totlAlcool);
		System.out.println("Gasolina: " + totlGasolina);
		System.out.println("Diesel: " + totlDiesel);
		
		sc.close();

	}

}
