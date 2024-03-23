package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int line = sc.nextInt();
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int colum = sc.nextInt();
		
		int [][] matriz = new int[line][colum];
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número para validar se está na matriz: ");
		int x = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j);
					if(j - 1 >=0) {
						System.out.println("Left " + matriz[i][j - 1]);
					}
					if(j + 1 <= matriz[i].length) {
						System.out.println("Rigt " + matriz[i][j]);
					}
					if((i - 1) >=0 && (i - 1)<matriz.length) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if((i + 1)>=0 && (i + 1)<matriz.length) {
						System.out.println("Down " + matriz[i + 1][j]);
					}
					
				}
			}
		}
		
	}

}
