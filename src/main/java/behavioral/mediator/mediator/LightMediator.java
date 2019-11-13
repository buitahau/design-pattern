
package behavioral.mediator.mediator;

import java.util.HashSet;
import java.util.Set;

import behavioral.mediator.element.Element;
import behavioral.mediator.trafficlight.Light;
import behavioral.mediator.enums.State;

public class LightMediator {

	private Set<Light> trafficSignals = new HashSet<>();
	private Set<Element> elements = new HashSet<>();

	public void registerLight(Light light) {

		trafficSignals.add(light);
	}

	public void unRegisterLight(Light light) {

		trafficSignals.remove(light);
	}

	public void registerElement(Element element) {

		elements.add(element);
	}

	public void unRegisterElement(Element element) {

		elements.remove(element);
	}

	public void notifyMediator(Light light) {

		System.out.printf(
			"%s is turned %s \n", light.getColor(), light.getCurrentState());

		if (light.getCurrentState() == State.ON) {
			String currentColor = light.getColor();
			stopElement(currentColor);
			goElement(currentColor);

			turnOffAllOtherLights(light);
		}
	}

	private void turnOffAllOtherLights(Light light) {

		for (Light otherLight : trafficSignals) {
			if (!(light.equals(otherLight))) {
				otherLight.turnOff();
			}
		}
		System.out.println("---");
	}

	private void stopElement(String currentColor) {

		for(Element element : elements) {
			element.stop(currentColor);
		}
	}

	private void goElement(String currentColor) {

		for(Element element : elements) {
			element.go(currentColor);
		}
	}
}
