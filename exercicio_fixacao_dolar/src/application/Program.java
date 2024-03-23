package application;
import java.util.Locale;
import java.util.Scanner;

import bank.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		CurrencyConverter bank = new CurrencyConverter();
		System.out.print("Whats is the dollar price? ");
		bank.dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		bank.quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais %.2f%n", bank.amountToBePaid());
		sc.close();
	}

}
