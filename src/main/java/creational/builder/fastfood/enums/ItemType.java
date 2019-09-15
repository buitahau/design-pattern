package creational.builder.fastfood.enums;

/**
 * Created by HauKute on 9/15/2019.
 */
public enum ItemType {
	BREAD_SIMPLE(1000), BREAD_EGG(2000),
	SOY_SAUCE(300), FISH_SAUCE(400), OLIVE_SAUCE(500),
	SALAD(500), CUCUMBER(600), TOMATO(500);

	private double price;

	ItemType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
