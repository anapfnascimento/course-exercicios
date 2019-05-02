package exerciciosSecao04.entities;

public class Conta {
	private int numConta;
	private String nomTitular;
	private double saldo;
	
	//Construtores
	public Conta() {
	}

	public Conta(int numConta, String nomTitular) {
		this.numConta = numConta;
		this.nomTitular = nomTitular;
	}

	public Conta(int numConta, String nomTitular, double vlrDepInicial) {
		this.numConta = numConta;
		this.nomTitular = nomTitular;
//		this.saldo = vlrDepInicial;
		deposito(vlrDepInicial); // para prevenir mudanças no construtor caso 
		                         // a regra de depósito seja alterada. 
		                         // Ex: Caso seja criado uma taxa de depósito
	}

	// getters e setters
	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double vlrDeposito) {
		this.saldo += vlrDeposito;
	}
	
	public void saque(double vlrSaque) {
		this.saldo = this.saldo - vlrSaque - 5.00;
	}
	
	public String toString() {
		return "Account " 
				+ this.numConta
				+ ", Holder: "
				+ this.nomTitular
				+ ", Balance: $ "
				+ String.format("%.2f", this.saldo);
	}

}
