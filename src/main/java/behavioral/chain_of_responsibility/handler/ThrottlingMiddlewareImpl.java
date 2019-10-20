
package behavioral.chain_of_responsibility.handler;

/**
 * Created by HauKute on 10/19/2019. ConcreteHandler. Checks whether there are
 * too many failed login requests.
 */
public class ThrottlingMiddlewareImpl extends MiddlewareImpl {

	private int requestPerminute;
	private int request;
	private long currentTime;

	public ThrottlingMiddlewareImpl(int requestPerminute) {

		this.requestPerminute = requestPerminute;
		this.currentTime = System.currentTimeMillis();
	}

	/**
	 * Please, not that checkNext() call can be inserted both in the beginning
	 * of this method and in the end. <p> This gives much more flexibility than
	 * a simple loop over all middleware objects. For instance, an element of a
	 * chain can change the order of checks by running its check after all other
	 * checks.
	 */
	public boolean check(String email, String password)
		throws Exception {

		if (System.currentTimeMillis() > currentTime + 60000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		request++;
		if (request > requestPerminute) {
			System.out.println("Request limit exceeded!");
			throw new Exception("Request limit exceeded!");
		}
		return checkNext(email, password);
	}
}
