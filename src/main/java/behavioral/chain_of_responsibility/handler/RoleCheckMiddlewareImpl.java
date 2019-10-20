
package behavioral.chain_of_responsibility.handler;

/**
 * Created by HauKute on 10/19/2019. ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddlewareImpl extends MiddlewareImpl {

	private static final String emailAdmin = "admin@example.com";
	private static final String passwordAdmin = "123456";

	public boolean check(String email, String password)
		throws Exception {

		if (isAdmin(email, password)) {
			// if user, not check any things, auto pass all
			System.out.println("Hello, admin!");
			return true;
		}
		System.out.println("Hello, user!");
		return checkNext(email, password);
	}

	private boolean isAdmin(String email, String password) {

		return email.equals(emailAdmin) && password.equals(passwordAdmin);
	}
}
