package creational.singleton;

/**
 * Created by HauKute on 9/4/2019.
 */
public class LazyInitialization {
	private static LazyInitialization INSTANCE;

	private LazyInitialization() {

	}

	public static LazyInitialization getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyInitialization();
		}
		return INSTANCE;
	}
}
