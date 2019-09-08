package creational.singleton;

/**
 * Created by HauKute on 9/7/2019.
 */
public class BillPughSingleton {

	private BillPughSingleton() {

	}

	// static inner class - innser classes are not loaded until they are referenced
	private static class BillPullSingletonHelper {
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPullSingletonHelper.INSTANCE;
	}
}
