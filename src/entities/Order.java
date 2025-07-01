package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
		
	}
	
	
	
	public Order(OrderStatus status, Client client) {
		super();
		moment = LocalDateTime.now();
		this.status = status;
		this.client = client;
	}



	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem i: items) {
			sum+=i.subTotal();		
		}
		return sum;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " +fmt.format(moment) +  "\n");
		sb.append("Order status: " + status+ "\n");
		sb.append("Order items: \n");
		
		for(OrderItem i : items) {
			sb.append(i.toString() + "\n");
		}
		sb.append(client.toString() + "\n");
		sb.append("Total price: $" +total() +  "\n");
		
		
		return sb.toString();
	}

	
	

}
