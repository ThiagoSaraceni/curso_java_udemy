package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.print("Enter order data: ");
		String status = sc.nextLine();
		OrderStatus ordstatus = OrderStatus.valueOf(sc.next());
		
		Date date_now = new Date();
		
		Order order = new Order(date_now, ordstatus, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			Product p1 = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int qntt = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderitem = new OrderItem(qntt, productPrice, p1);
			
			order.addItem(orderitem);
			
		}
		
		System.out.println("-----------");
		System.out.println("ORDER SUMMARY");
		System.out.println(order.toString());
		
	}

}
