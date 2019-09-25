package structural.decorator.component;

import java.util.Date;

/**
 * Created by HauKute on 9/26/2019.
 */
public interface EmployeeComponent {
	String getName();

	void doTask();

	void join(Date joinDate);

	void terminate(Date terminalDate);

	String formatDate(Date theDate);

	void showBasicInformation();
}
