package behavioral.visitor.element;

public class Rectangle extends ShapeImpl {

	private int width;
	private int height;

	public Rectangle(int id, int x, int y, int width, int height) {

		super(id, x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {

		return width;
	}

	public int getHeight() {

		return height;
	}
}
