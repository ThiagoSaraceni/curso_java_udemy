package entities;

import java.util.Locale;
import java.util.Scanner;

import application.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		System.out.print("Nome do aluno: ");
		estudante.name = sc.nextLine();
		System.out.print("Nota 1: ");
		estudante.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		estudante.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		estudante.n3 = sc.nextDouble();
		System.out.println();
		System.out.println("FINAL GRADE: " + estudante.lastGrade());
		estudante.pass();
		
	}

}
