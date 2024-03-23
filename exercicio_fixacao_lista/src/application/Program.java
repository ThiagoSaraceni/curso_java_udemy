package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		int id;
		String name;
		double salary;
		int whatid;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int num = sc.nextInt();
		List<Integer> idd = new ArrayList<>();
		List<String> namee = new ArrayList<>();
		List<Double> salaryy = new ArrayList<>();
		
		Employee employee = new Employee();
		
	for(int i=0;i<num;i++) {
		System.out.println();
		System.out.println("Employee #" + (i + 1));
		System.out.print("ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Salary: ");
		salary = sc.nextDouble();
		idd.add(id);
		namee.add(name);
		salaryy.add(salary);
	}
	
	System.out.print("Enter the employee id that will have salary increase: ");
	whatid = sc.nextInt();
	sc.nextLine();
			
	if(idd.contains(whatid)) {
		int posicao = idd.indexOf(whatid);
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		double currentSalary = salaryy.get(posicao);
		double increasedSalary = currentSalary * (1 + percentage / 100);
	    // Update the salary in the salaryy list with the calculated increased salary
		salaryy.set(posicao, increasedSalary);
	} else {
		System.out.println("This id does not exist!");
	}
	
	System.out.println("List of employees: ");
	
	for(int i=0; i<idd.size();i++) {
		System.out.printf("%d, %s, %.2f%n", idd.get(i), namee.get(i), salaryy.get(i));
	}
	
	sc.close();
	}
}
