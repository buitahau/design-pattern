package creational.abstract_factory.ex1.abstract_factory.impl;

import creational.abstract_factory.ex1.abstract_factory.FurnitureAbstractFactory;
import creational.abstract_factory.ex1.product_factory.Chair;
import creational.abstract_factory.ex1.product_factory.Table;
import creational.abstract_factory.ex1.product_factory.impl.PlasticChair;
import creational.abstract_factory.ex1.product_factory.impl.PlasticTable;

/**
 * Created by HauKute on 9/14/2019.
 */
public class PlasticFactory extends FurnitureAbstractFactory {
	public Chair createChair() {
		return new PlasticChair();
	}

	public Table createTable() {
		return new PlasticTable();
	}
}
