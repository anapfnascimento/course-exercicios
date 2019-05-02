package exerciciosNivelamento02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaIni, horaFim, duracao;

		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		
		if(horaIni < horaFim) {
			duracao = horaFim - horaIni;
		}else {
			duracao = 24 - horaIni + horaFim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
			
	}

}
