package structural.decorator.decorator;

import structural.decorator.component.EmployeeComponent;

/**
 * Created by HauKute on 9/29/2019.
 */
public class TeamMember extends EmployeeDecorator {
	public TeamMember(EmployeeComponent employee) {
		super(employee);
	}

	public void reportTask() {
		System.out.println(this.employee.getName() + " is reporting his assigned tasks.");
	}

	public void coordinateWithOthers() {
		System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
	}

	@Override
	public void doTask() {
		super.doTask();
		reportTask();
		coordinateWithOthers();
	}
}
