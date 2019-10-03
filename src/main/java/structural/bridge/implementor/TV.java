package structural.bridge.implementor;

public class TV implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;
	private int maxVolume = 100;
	private int minVolume = 0;

	public boolean isEnabled() {

		return on;
	}

	public void enable() {

		on = true;
	}

	public void disable() {

		on = false;
	}

	public int getVolume() {

		return volume;
	}

	public void setVolume(int volume) {

		if (volume > maxVolume) {
			this.volume = maxVolume;
		} else if (volume < minVolume) {
			this.volume = minVolume;
		} else {
			this.volume = volume;
		}
	}

	public int getChannel() {

		return channel;
	}

	public void setChannel(int channel) {

		this.channel = channel;
	}

	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm TV set.");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");
	}

}
