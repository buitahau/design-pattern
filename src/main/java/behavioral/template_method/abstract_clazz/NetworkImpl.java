package behavioral.template_method.abstract_clazz;

/**
 * Created by HauKute on 11/24/2019.
 */
public abstract class NetworkImpl implements Network{
	protected String userName;
	protected String password;

	protected NetworkImpl() {
	}

	public final boolean post(String message) {
		// Authenticate before posting. Every network uses a different
		// authentication method.
		if (logIn(this.userName, this.password)) {
			// Send the post data.
			boolean result = sendData(message.getBytes());
			logOut();
			return result;
		}
		return false;
	}

	protected void simulateNetworkLatency() {
		try {
			int i = 0;
			System.out.println();
			while (i < 10) {
				System.out.print(".");
				Thread.sleep(500);
				i++;
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
