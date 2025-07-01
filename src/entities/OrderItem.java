package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	
	public OrderItem() {}

	public OrderItem(Integer quantity, Product product, Double price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		double subTotal= price * quantity;		
		return subTotal;
			
	}

	@Override
	public String toString() {
		return product.getName() 
				+ ", $" + String.format("%.2f", price) 
				+ ", Quantity: " + quantity 
				+ ", Subtotal: $" + String.format("%.2f",subTotal());
	}
	
	
	
	

}
