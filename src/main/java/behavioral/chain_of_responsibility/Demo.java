
package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handler.Middleware;
import behavioral.chain_of_responsibility.handler.RoleCheckMiddlewareImpl;
import behavioral.chain_of_responsibility.handler.ThrottlingMiddlewareImpl;
import behavioral.chain_of_responsibility.handler.UserExistsMiddlewareImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HauKute on 10/19/2019.
 */
public class Demo {

	private static BufferedReader reader =
		new BufferedReader(new InputStreamReader(System.in));

	private static Server server;

	private static void init() {

		server = new Server();
		server.register("admin@example.com", "123456");
		server.register("user@example.com", "1234567890");

		// All checks are linked. Client can build various chains using the same
		// components.
		Middleware middleware = new ThrottlingMiddlewareImpl(2);

		middleware.linkWith(new UserExistsMiddlewareImpl(server))
				.linkWith(new RoleCheckMiddlewareImpl());

		// Server gets a chain from client code.
		server.setMiddleware(middleware);
	}

	public static void main(String[] args)
		throws Exception {

		init();

		boolean success;
		do {
			System.out.print("Enter email: ");
			String email = reader.readLine();
			System.out.print("Input password: ");
			String password = reader.readLine();

			success = server.login(email, password);
		}
		while (!success);
	}

}
