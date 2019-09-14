package creational.abstract_factory.ex1.product_factory.impl;

import creational.abstract_factory.ex1.product_factory.Table;

/**
 * Created by HauKute on 9/14/2019.
 */
public class PlasticTable implements Table {
	public void getName() {
		System.out.println("Plastic Table");
	}
}
