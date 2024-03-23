package application;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	public double avarage;
	public boolean pass;
	
	public double lastGrade(){
		return avarage =  n1 + n2 + n3;
	}
	
	public void pass() {
		if(avarage > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f POINTS", Math.abs(this.avarage - 60));
	}
	}
}
