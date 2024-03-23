package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {
	
	public static void main(String[] args) {
		String numconta;
		String name;
		char resp;
		Double initialValue;
		double deposit;
		double saque;
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		BankAccount bank;
		
		System.out.print("Enter account number: ");
		numconta = sc.nextLine();
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		System.out.print("Is there a initial value deposit (y/n)? ");
		resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialValue = sc.nextDouble();
			bank = new BankAccount(numconta, name, initialValue);
		} else {
			bank = new BankAccount(numconta, name);
		}
		
		
		
		System.out.println();
		System.out.println(bank.toString());
		System.out.println();
		
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		bank.deposit(deposit);
		System.out.println(bank.toString());
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		saque = sc.nextDouble();
		bank.saque(saque);
		System.out.println(bank.toString());
		sc.close();
	}

}
