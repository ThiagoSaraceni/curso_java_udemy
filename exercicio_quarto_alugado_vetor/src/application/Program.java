package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		String nome, email;
		int room;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pessoa[] quartos = new Pessoa[10];
		System.out.print("Quantos quartos serão alugados? ");
		int num = sc.nextInt();
		for (int i=0; i<num; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + (i + 1));
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			room = sc.nextInt();
			quartos[room] = new Pessoa(nome, email, room);
		}
		
		System.out.println("Quartos alugados: ");
		for (int i=0; i<quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}
	}

}
