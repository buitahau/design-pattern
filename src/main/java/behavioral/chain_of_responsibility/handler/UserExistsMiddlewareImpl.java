
package behavioral.chain_of_responsibility.handler;

import behavioral.chain_of_responsibility.Server;

/**
 * Created by HauKute on 10/19/2019.
 */
public class UserExistsMiddlewareImpl extends MiddlewareImpl {

	private Server server;

	public UserExistsMiddlewareImpl(Server server) {

		this.server = server;
	}

	public boolean check(String email, String password)
		throws Exception {

		if (!server.hasEmail(email)) {
			System.out.println("This email is not registered!");
			return false;
		}
		if (!server.isValidPassword(email, password)) {
			System.out.println("Wrong password!");
			return false;
		}
		return checkNext(email, password);
	}
}
