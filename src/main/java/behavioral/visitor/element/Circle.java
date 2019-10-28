package behavioral.visitor.element;

public class Circle extends ShapeImpl {

	private int radius;

	public Circle(int id, int x, int y, int radius) {

		super(id, x, y);
		this.radius = radius;
	}

	public int getRadius() {

		return radius;
	}
}
