
package behavioral.chain_of_responsibility.handler;

/**
 * Created by HauKute on 10/19/2019.
 */
public interface Middleware {

	Middleware linkWith(Middleware next);

	boolean check(String email, String password)
		throws Exception;
}
