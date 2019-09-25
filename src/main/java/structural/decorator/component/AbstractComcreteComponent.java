package structural.decorator.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by HauKute on 9/26/2019.
 */
public abstract class AbstractComcreteComponent implements EmployeeComponent {

	public String formatDate(Date theDate) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(theDate);
	}

	public void showBasicInformation() {
		System.out.println("-------");
		System.out.println("The basic information of " + getName());

		join(Calendar.getInstance().getTime());

		Calendar terminateDate = Calendar.getInstance();
		terminateDate.add(Calendar.MONTH, 6);
		terminate(terminateDate.getTime());
	}
}
