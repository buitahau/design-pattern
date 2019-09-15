package creational.builder.fastfood.builder;

import creational.builder.fastfood.product.Item;
import creational.builder.fastfood.enums.ItemType;
import creational.builder.fastfood.product.Order;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by HauKute on 9/15/2019.
 */
public class FastFoodOrderBuilder implements OrderBuilder {

	private List<Item> itemOrders;

	public FastFoodOrderBuilder() {
		itemOrders = new ArrayList<Item>();
	}

	public OrderBuilder order(int quantity, ItemType type) {
		itemOrders.add(new Item(quantity, type));
		return this;
	}

	public Order build() {
		return new Order(itemOrders);
	}
}
