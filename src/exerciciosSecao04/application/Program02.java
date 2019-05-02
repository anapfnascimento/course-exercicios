package exerciciosSecao04.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosSecao04.entities.Conta;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Enter initial deposit: ");
			double vlrDepInicial = sc.nextDouble();
			conta = new Conta(numConta, nome, vlrDepInicial);
		}else {
			conta = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double vlrDeposito = sc.nextDouble();
		
		conta.deposito(vlrDeposito);
		
		System.out.println("Updated account data:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double vlrSaque = sc.nextDouble();
		
		conta.saque(vlrSaque);
		
		System.out.println("Updated account data:");
		System.out.print(conta);
		sc.close();

	}

}
