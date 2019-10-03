package structural.bridge.abstraction;

import structural.bridge.implementor.Device;

public class AdvanceRemote extends BasicRemote {

	public AdvanceRemote(Device device) {
		super(device);
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
