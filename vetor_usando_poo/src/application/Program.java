package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos objetos você irá criar? ");
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do %d° produto: ", i + 1);
			String name = sc.nextLine();
			System.out.printf("Digite o preço do %d° produto: ", i + 1);
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double sum = 0.0;
		
		for (int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avarage = sum / n;
		
		System.out.printf("A média é %.2f", avarage);
		System.out.println();
		
		for(int i=0;i<vect.length;i++) {
			System.out.print(vect[i].toString());
		}
		
		sc.close();
	}

}
