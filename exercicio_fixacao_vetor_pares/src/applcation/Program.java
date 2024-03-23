package applcation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você irá digitar: ");
		int num = sc.nextInt();
		int vect[] = new int[num];
		int totpar = 0;
		for(int i=0;i<num;i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			vect[i] = sc.nextInt();
		}
		System.out.println("\n\nNUMEROS PARES: ");
		for(int i=0;i<num;i++) {
			if(vect[i] % 2 == 0) {
				totpar += 1;
				System.out.print(vect[i] + " ");
			}
		}
		System.out.println("\n\nQuantidade de pares: " + totpar);
		sc.close();
	}

}
