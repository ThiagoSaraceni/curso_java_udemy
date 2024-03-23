package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private double aumento;
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
	public double getSalary() {
		return salary * aumento;
	}

	public void aumento(double aumento) {
		this.aumento = aumento;
	}
	
	
}
