package application;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double porcentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary() {
		double increasedSalary = this.grossSalary * (porcentage/100);
		return (this.grossSalary + increasedSalary) - tax;
	}
	
}
