package entities;

import java.util.Locale;
import java.util.Scanner;

import application.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee funcionario = new Employee();
		System.out.print("name: ");
		funcionario.name = sc.nextLine();
		System.out.print("salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $%.2f ",  funcionario.name, funcionario.netSalary());
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		funcionario.porcentage = sc.nextDouble();
		System.out.printf("Updated data: %s, $%.2f", funcionario.name, funcionario.increaseSalary());
		sc.close();
	}

}
