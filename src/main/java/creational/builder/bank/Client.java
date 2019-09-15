package creational.builder.bank;

/**
 * Created by HauKute on 9/15/2019.
 */
public class Client {
	public static void main(String[] args) {
		BankAccount newAccount = new BankAccount
				.BankAccountBuilder("GP Coder", "0123456789")
				.withEmail("contact@gpcoder.com")
				.wantNewsletter(true)
				.build();
		System.out.println(newAccount);
	}
}
