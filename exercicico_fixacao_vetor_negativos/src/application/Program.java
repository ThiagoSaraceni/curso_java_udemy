package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int [] arraypositivo = new int[n];
		int [] arraynegativo = new int[n];
		for (int i=0;i<n;i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			arraypositivo[i] = sc.nextInt();
			if (arraypositivo[i] < 0) {
				arraynegativo[i] = arraypositivo[i];
			}
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i=0; i<n;i++)
			if (arraynegativo[i] < 0) {
				System.out.print(arraynegativo[i] + " ");
			}
	}

}
