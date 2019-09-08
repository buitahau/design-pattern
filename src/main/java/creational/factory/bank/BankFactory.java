package creational.factory.bank;

/**
 * Created by HauKute on 9/9/2019.
 */
public class BankFactory {

	private BankFactory() {

	}

	public static Bank getBank(BankType bankType) throws Exception {
		switch (bankType) {
			case VIETTINBANK:
				return new VietTinBank();
			case TPBANK:
				return new TPBank();
			default:
				throw new Exception("Wrong bank type");
		}
	}
}
