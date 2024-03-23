import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são? ");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else (hora < 18) {
			System.out.println("Boa tarde");
		} else if(hora < 22) {
			System.out.println("Boa noite!!");
		} else {
			System.out.println("Boa madrugada");
		}
		
		
	}
}