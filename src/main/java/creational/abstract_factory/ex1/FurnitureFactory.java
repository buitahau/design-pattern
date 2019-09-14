package creational.abstract_factory.ex1;

import creational.abstract_factory.ex1.abstract_factory.FurnitureAbstractFactory;
import creational.abstract_factory.ex1.abstract_factory.impl.PlasticFactory;
import creational.abstract_factory.ex1.abstract_factory.impl.WoodAbstractFactory;

/**
 * Created by HauKute on 9/14/2019.
 */
public class FurnitureFactory {

	private FurnitureFactory() {
	}

	public static FurnitureAbstractFactory getFactory(Type type) {
		switch (type) {
			case PLASTIC:
				return new PlasticFactory();
			case WOOD:
				return new WoodAbstractFactory();
			default:
				throw new UnsupportedOperationException("Wrong type");
		}
	}
}
