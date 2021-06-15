package entities;

public class OrderItem {

	private Integer quantity;
	private double price;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public double subTotal() {
		return quantity*price;
	}
	
	
	
}
