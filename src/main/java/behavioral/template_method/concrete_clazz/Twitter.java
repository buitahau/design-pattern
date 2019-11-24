package behavioral.template_method.concrete_clazz;

import behavioral.template_method.abstract_clazz.NetworkImpl;

/**
 * Created by HauKute on 11/24/2019.
 */
public class Twitter extends NetworkImpl {

	public Twitter(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public boolean logIn(String userName, String password) {
		System.out.println("\nChecking user's parameters");
		System.out.println("Name: " + this.userName);
		System.out.print("Password: ");
		for (int i = 0; i < this.password.length(); i++) {
			System.out.print("*");
		}
		simulateNetworkLatency();
		System.out.println("\n\nLogIn success on Twitter");
		return true;
	}

	@Override
	public boolean sendData(byte[] data) {
		boolean messagePosted = true;
		if (messagePosted) {
			System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void logOut() {
		System.out.println("User: '" + userName + "' was logged out from Twitter");
	}
}
