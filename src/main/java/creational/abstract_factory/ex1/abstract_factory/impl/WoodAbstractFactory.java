package creational.abstract_factory.ex1.abstract_factory.impl;

import creational.abstract_factory.ex1.abstract_factory.FurnitureAbstractFactory;
import creational.abstract_factory.ex1.product_factory.Chair;
import creational.abstract_factory.ex1.product_factory.Table;
import creational.abstract_factory.ex1.product_factory.impl.WoodChair;
import creational.abstract_factory.ex1.product_factory.impl.WoodTable;

/**
 * Created by HauKute on 9/14/2019.
 */
public class WoodAbstractFactory extends FurnitureAbstractFactory {
	public Chair createChair() {
		return new WoodChair();
	}

	public Table createTable() {
		return new WoodTable();
	}
}
