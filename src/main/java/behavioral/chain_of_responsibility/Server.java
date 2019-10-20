
package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handler.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HauKute on 10/19/2019.
 */
public class Server {

	private Map<String, String> users = new HashMap<String, String>();

	private Middleware middleware;

	/**
	 * Client passes a chain of object to server. This improves flexibility and
	 * makes testing the server class easier.
	 */
	public void setMiddleware(Middleware middleware) {

		this.middleware = middleware;
	}

	/**
	 * Server gets email and password from client and sends the authorization
	 * request to the chain.
	 */
	public boolean login(String email, String password)
		throws Exception {

		// Start check chains
		if (middleware.check(email, password)) {
			System.out.println("Authorization have been successful!");

			// Do something useful here for authorized users.

			return true;
		}
		return false;
	}

	public void register(String email, String password) {

		users.put(email, password);
	}

	public boolean hasEmail(String email) {

		return users.containsKey(email);
	}

	public boolean isValidPassword(String email, String password) {

		return users.get(email).equals(password);
	}
}
