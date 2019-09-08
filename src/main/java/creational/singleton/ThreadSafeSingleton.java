package creational.singleton;

/**
 * Created by HauKute on 9/7/2019.
 */
public class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton INSTANCE;

	private ThreadSafeSingleton() {

	}

	public static ThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafeSingleton.class) {
				INSTANCE = new ThreadSafeSingleton();
			}
		}
		return INSTANCE;
	}
}
