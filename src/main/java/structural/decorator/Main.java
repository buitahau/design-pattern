package structural.decorator;

import structural.decorator.component.EmployeeComponent;
import structural.decorator.component.EmployeeConcreteComponenent;
import structural.decorator.decorator.Manager;
import structural.decorator.decorator.TeamLeader;

/**
 * Created by HauKute on 9/26/2019.
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("NORMAL EMPLOYEE: ");
		EmployeeComponent employee = new EmployeeConcreteComponenent("GPCoder");
		employee.showBasicInformation();
		employee.doTask();

		System.out.println("MANAGER: ");
		EmployeeComponent manager = new Manager(employee);
		manager.showBasicInformation();
		manager.doTask();

		System.out.println("TEAM LEADER: ");
		EmployeeComponent teamLeader = new TeamLeader(employee);
		teamLeader.showBasicInformation();
		teamLeader.doTask();

		System.out.println("TEAM LEADER AND MANAGER: ");
		EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
		teamLeaderAndManager.showBasicInformation();
		teamLeaderAndManager.doTask();
	}
}
