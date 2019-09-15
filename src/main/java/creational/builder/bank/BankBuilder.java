package creational.builder.bank;

/**
 * Created by HauKute on 9/15/2019.
 */
public interface BankBuilder {
	BankBuilder withAddress(String address);

	BankBuilder withEmail(String email);

	BankBuilder wantNewsletter(boolean newsletter);

	BankBuilder wantMobileBanking(boolean mobileBanking);

	BankAccount build();
}
