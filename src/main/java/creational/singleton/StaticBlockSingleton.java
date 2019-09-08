package creational.singleton;

/**
 * Created by HauKute on 9/3/2019.
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {

		}
	}

	private StaticBlockSingleton() {

	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
