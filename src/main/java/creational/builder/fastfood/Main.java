package creational.builder.fastfood;

import creational.builder.fastfood.builder.FastFoodOrderBuilder;
import creational.builder.fastfood.enums.ItemType;
import creational.builder.fastfood.product.Order;

/**
 * Created by HauKute on 9/15/2019.
 */
public class Main {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder()
				.order(2, ItemType.BREAD_EGG)
				.order(1, ItemType.FISH_SAUCE)
				.build();

		order.calculate();
	}
}
