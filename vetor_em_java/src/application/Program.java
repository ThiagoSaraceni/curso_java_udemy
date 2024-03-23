package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual tamanho do seu vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite a %d° nota ", i + 1);
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i]; 
		}
		
		double avarage = sum / n;
		
		System.out.printf("Avarage %.2f", avarage);
	}

}
