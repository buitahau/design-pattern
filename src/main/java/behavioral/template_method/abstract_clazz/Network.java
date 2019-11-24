package behavioral.template_method.abstract_clazz;

/**
 * Created by HauKute on 11/24/2019.
 */
public interface Network {
	boolean logIn(String userName, String password);
	boolean sendData(byte[] data);
	void logOut();
	boolean post(String message);
}
