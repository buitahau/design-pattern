package structural.bridge;

import structural.bridge.abstraction.AdvanceRemote;
import structural.bridge.abstraction.BasicRemote;
import structural.bridge.implementor.Device;
import structural.bridge.implementor.Radio;
import structural.bridge.implementor.TV;

public class Client {

	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvanceRemote advancedRemote = new AdvanceRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
