package creational.builder.fastfood.builder;

import creational.builder.fastfood.enums.ItemType;
import creational.builder.fastfood.product.Order;

/**
 * Created by HauKute on 9/15/2019.
 */
public interface OrderBuilder {

	OrderBuilder order(int quantity, ItemType type);

	Order build();
}
