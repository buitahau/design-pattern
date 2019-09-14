package creational.abstract_factory.ex1.abstract_factory;

import creational.abstract_factory.ex1.product_factory.Chair;
import creational.abstract_factory.ex1.product_factory.Table;

/**
 * Created by HauKute on 9/14/2019.
 */
public abstract class FurnitureAbstractFactory {
	public abstract Chair createChair();

	public abstract Table createTable();
}
