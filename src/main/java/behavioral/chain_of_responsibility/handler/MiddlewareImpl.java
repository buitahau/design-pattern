
package behavioral.chain_of_responsibility.handler;

/**
 * Created by HauKute on 10/19/2019. Base middleware class.
 */
public abstract class MiddlewareImpl implements Middleware {

	private Middleware next;

	/**
	 * Builds chains of middleware objects.
	 */
	public Middleware linkWith(Middleware next) {

		this.next = next;
		return next;
	}

	/**
	 * Runs check on the next object in chain or ends traversing if we're in
	 * last object in chain.
	 */
	protected boolean checkNext(String email, String password)
		throws Exception {

		if (this.next == null) {
			return true;
		}
		return this.next.check(email, password);
	}
}
