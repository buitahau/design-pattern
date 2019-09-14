package creational.abstract_factory.ex1.product_factory.impl;

import creational.abstract_factory.ex1.product_factory.Chair;

/**
 * Created by HauKute on 9/14/2019.
 */
public class PlasticChair implements Chair {
	public void getName() {
		System.out.println("Plastic Chair");
	}
}
