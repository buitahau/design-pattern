
package behavioral.mediator;

import java.util.concurrent.TimeUnit;

import behavioral.mediator.element.Element;
import behavioral.mediator.element.Person;
import behavioral.mediator.element.Vehicle;
import behavioral.mediator.enums.TrafficColor;
import behavioral.mediator.mediator.LightMediator;
import behavioral.mediator.trafficlight.Light;

public class AutoRotateTrafficLightApp {

	public static void main(String[] args) {

		LightMediator mediator = new LightMediator();

		Light[] lights = {
			new Light(TrafficColor.RED.name(), mediator),
			new Light(TrafficColor.YELLOW.name(), mediator),
			new Light(TrafficColor.GREEN.name(), mediator)
		};

		Element hauKute = new Person("Hau Kute", TrafficColor.RED.name());
		Element bicycle = new Vehicle("Xe dap", TrafficColor.GREEN.name());
		Element motor = new Vehicle("Xe may", TrafficColor.GREEN.name());

		mediator.registerElement(hauKute);
		mediator.registerElement(bicycle);
		mediator.registerElement(motor);

		int currentLightIndex = 0;

		Light light;

		while (true) {
			if (currentLightIndex >= lights.length) {
				currentLightIndex = 0;
			}
			light = lights[currentLightIndex];
			light.turnOn();
			timer();
			currentLightIndex++;
		}
	}

	private static void timer() {

		try {
			TimeUnit.SECONDS.sleep(5);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
