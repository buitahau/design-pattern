package structural.decorator.component;

import java.util.Date;

/**
 * Created by HauKute on 9/26/2019.
 */
public final class EmployeeConcreteComponenent extends AbstractComcreteComponent {

	private String name;

	public EmployeeConcreteComponenent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void doTask() {
		// Unassigned Task
	}

	public void join(Date joinDate) {
		System.out.println(this.getName() + " joined on " + formatDate(joinDate));
	}

	public void terminate(Date terminalDate) {
		System.out.println(this.getName() + " terminated on " + formatDate(terminalDate));
	}
}
