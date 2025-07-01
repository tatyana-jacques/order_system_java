import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birth  = LocalDate.parse(sc.next(),fmt);
		Client client = new Client(name,email,birth);
		sc.nextLine();
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(status,client);
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		for(int i = 0; i<items;i++) {
			sc.nextLine();
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name:");
			String productName = sc.nextLine();
			System.out.print("Product price:");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(quantity,product, productPrice);
			
			order.addItem(item);
			
		}
					
		System.out.println(order);
		
		
		sc.close();
	}

}
