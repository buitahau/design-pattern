package creational.singleton;

/**
 * Created by HauKute on 9/7/2019.
 */
public class Main {

	public static void main(String[] args) {

		EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

		LazyInitialization lazyInitialization = LazyInitialization.getInstance();

		StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

		System.out.println("Done");
	}
}
