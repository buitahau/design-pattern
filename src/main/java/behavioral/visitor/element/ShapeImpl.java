package behavioral.visitor.element;

import behavioral.visitor.visitor.Visitor;

/**
 * Created by HauKute on 10/28/2019.
 */
public abstract class ShapeImpl implements Shape {
	private int id;
	private int x;
	private int y;

	protected ShapeImpl(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {

		// move shape
	}

	public void draw() {

		// draw shape
	}

	public int getId() {

		return id;
	}

	public int getX() {

		return x;
	}

	public int getY() {

		return y;
	}

	public String accept(Visitor visitor) {

		return visitor.visit(this);
	}
}
