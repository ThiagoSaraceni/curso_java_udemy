package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		double maior = 0.0;
		int posicao = 0;
		
		double vect[] = new double[num];
		maior = vect[0];
		for(int i=0;i<vect.length;i++) {
			System.out.printf("Digite o %d° numero: ", i + 1);
			vect[i] = sc.nextDouble();
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.printf("Posicao do maior valor = %d", posicao + 1);
		sc.close();
	}

}
