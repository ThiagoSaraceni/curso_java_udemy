package entities;

public class BankAccount {
	private String numAccount;
	private String nameTitular;
	private double saldo;
	
	public BankAccount(String numAccount, String nameTitular) {
		this.numAccount = numAccount;
		this.nameTitular = nameTitular;
	}

	public BankAccount(String numAccount, String nameTitular, double saldo) {
		this.numAccount = numAccount;
		this.nameTitular = nameTitular;
		this.saldo = saldo;
	}

	public String getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}

	public String getNameTitular() {
		return nameTitular;
	}

	public void setNameTitular(String nameTitular) {
		this.nameTitular = nameTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

	public void deposit(double num) {
		this.saldo += num;
	}
	
	public void saque(double num) {
		this.saldo = (saldo - num) - 5;
	}


	public String toString() {
		return String.format("Account data: \nAccount %s, Holder: %s, Balance: $%.2f%n", this.numAccount, this.nameTitular, this.saldo);
	}
	
	
	
	
}
