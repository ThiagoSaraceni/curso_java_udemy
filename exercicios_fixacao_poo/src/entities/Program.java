package entities;

import java.util.Locale;
import java.util.Scanner;

import application.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle widht and height:");
		rect.widht = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
		

	}

}
