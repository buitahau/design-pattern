package creational.builder.fastfood.product;

import java.util.List;

/**
 * Created by HauKute on 9/15/2019.
 */
public class Order {
	private List<Item> itemOrders;

	public Order(List<Item> itemOrders) {
		this.itemOrders = itemOrders;
	}

	public double calculate() {
		double result = 0;
		System.out.println("-----ORDER-----");
		for (Item item : itemOrders) {
			result += item.calculate();
		}
		System.out.println("Total : " + result);
		System.out.println("-----***-----");
		return result;
	}
}
