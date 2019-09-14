package creational.abstract_factory.ex1;

import creational.abstract_factory.ex1.abstract_factory.FurnitureAbstractFactory;
import creational.abstract_factory.ex1.product_factory.Chair;
import creational.abstract_factory.ex1.product_factory.Table;

/**
 * Created by HauKute on 9/14/2019.
 */
public class Main {
	public static void main(String[] args) {
		FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(Type.PLASTIC);

		Chair chair = plasticFactory.createChair();
		chair.getName();

		Table table = plasticFactory.createTable();
		table.getName();
	}
}
