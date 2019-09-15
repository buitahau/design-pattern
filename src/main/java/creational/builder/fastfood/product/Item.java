package creational.builder.fastfood.product;

import creational.builder.fastfood.enums.ItemType;

/**
 * Created by HauKute on 9/15/2019.
 */
public class Item {
	private int quantity;
	private ItemType type;

	public Item(int quantity, ItemType type) {
		this.quantity = quantity;
		this.type = type;
	}

	public double calculate () {
		System.out.println("Quantity: " + quantity + " - Item: " + type + "/" + type.getPrice());
		return quantity * type.getPrice();
	}
}
