package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int [] array = new int[n];
		for (int i=0;i<n;i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			array[i] = sc.nextInt();
		}
		System.out.print("Valores = ");
		for (int i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		int soma = 0;
		double media = 0;
		for (int i=0;i<n;i++) {
			soma = soma + array[i];
		}
		media = soma / n;
		System.out.println("\nSoma: " + soma + "\nMédia: " + media);
	}

}
