package creational.prototype;

/**
 * Created by HauKute on 9/29/2019.
 */
public class Cell implements Cloneable {
	private String color;
	private int coordinator_x;
	private int coordinator_y;

	public Cell(Color color) {
		this.color = color.name();
	}

	public void setCoordinator(int x, int y) {
		this.coordinator_x = x;
		this.coordinator_y = y;
	}

	@Override
	public String toString() {
		return String.format("CELL [Color: %s; Coordinator: %s X %s ]", this.color, this.coordinator_x,
				this.coordinator_y);
	}

	@Override
	protected Cell clone() {
		try {
			return (Cell) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
