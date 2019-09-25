package structural.decorator.decorator;

import structural.decorator.component.EmployeeComponent;

/**
 * Created by HauKute on 9/26/2019.
 */
public class Manager extends EmployeeDecorator {
	public Manager(EmployeeComponent employee) {
		super(employee);
	}

	public void createRequirement() {
		System.out.println(employee.getName() + " is create requirements.");
	}

	public void assignTask() {
		System.out.println(employee.getName() + " is assigning tasks.");
	}

	public void manageProgress() {
		System.out.println(employee.getName() + " is managing the progress.");
	}

	@Override
	public void doTask() {
		employee.doTask();
		createRequirement();
		assignTask();
		manageProgress();
	}
}
