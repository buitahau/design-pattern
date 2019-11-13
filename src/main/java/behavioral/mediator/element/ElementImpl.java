package behavioral.mediator.element;

/**
 * Created by HauKute on 11/13/2019.
 */
public abstract class ElementImpl implements Element {
	private String colorRunning;
	private String name;

	protected ElementImpl(String name, String colorRunning) {
		this.name = name;
		this.colorRunning = colorRunning;
	}

	public String getColorRunning() {
		return colorRunning;
	}

	@Override
	public void stop(String currentColor) {
		if(!colorRunning.equals(currentColor)) {
			System.out.println(name + " stop");
		}
	}

	@Override
	public void go(String currentColor) {
		if(colorRunning.equals(currentColor)) {
			System.out.println(name + " go");
		}
	}
}
