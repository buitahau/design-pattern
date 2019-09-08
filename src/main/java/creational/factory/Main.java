package creational.factory;

import creational.factory.bank.Bank;
import creational.factory.bank.BankFactory;
import creational.factory.bank.BankType;

/**
 * Created by HauKute on 9/9/2019.
 */
public class Main {

	public static void main (String[] args) throws Exception {
		Bank viettinBank = BankFactory.getBank(BankType.VIETTINBANK);
		System.out.println(viettinBank.getBankName());

		Bank tpBank = BankFactory.getBank(BankType.TPBANK);
		System.out.println(tpBank.getBankName());
	}
}
