package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double somaaltura = 0;
		int undersixteen = 0;
		Person[] pessoa = new Person[n];
		for(int i=0; i<pessoa.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d° pessoa\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			if(idade < 16) {
				undersixteen += 1; 
			}
			System.out.print("altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Person(name, idade, altura);
			somaaltura += altura; 
		}
		double mediaaltura = somaaltura / n;
		double menor_desesseis = ((double)undersixteen / n) * 100.0;
		
		System.out.printf("Altura média :%.2f ", mediaaltura);
		System.out.println("Pessoas com menos de 16 anos: " + menor_desesseis);
		for(int i=0;i<pessoa.length;i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		for (int i=0; i<pessoa.length;i++) {
			System.out.println(pessoa[i].toString());
		}
		sc.close();
	}

}
