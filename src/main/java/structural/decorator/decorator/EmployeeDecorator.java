package structural.decorator.decorator;

import structural.decorator.component.AbstractComcreteComponent;
import structural.decorator.component.EmployeeComponent;

import java.util.Date;

/**
 * Created by HauKute on 9/26/2019.
 */
public abstract class EmployeeDecorator extends AbstractComcreteComponent {

	protected EmployeeComponent employee;

	protected EmployeeDecorator(EmployeeComponent employee) {
		this.employee = employee;
	}

	public String getName() {
		return employee.getName();
	}

	public void doTask() {
		employee.doTask();
	}

	public void join(Date joinDate) {
		employee.join(joinDate);
	}

	public void terminate(Date terminalDate) {
		employee.terminate(terminalDate);
	}
}
