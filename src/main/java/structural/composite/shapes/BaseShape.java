package structural.composite.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class BaseShape implements Shape {

	public int x;
	public int y;
	public Color color;
	private boolean selected = false;

	public BaseShape(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {

		return this.x;
	}

	public int getY() {

		return this.y;
	}

	public int getWidth() {

		return 0;
	}

	public int getHeight() {

		return 0;
	}

	public void move(int x, int y) {

		this.x += x;
		this.y += y;
	}

	public boolean isInsideBounds(int x, int y) {

		return x > getX() && x < (getX() + getWidth()) && 
				y > getY() && y < (getY() + getHeight());
	}

	public void select() {

		this.selected = true;
	}

	public void unSelect() {

		this.selected = false;
	}

	public boolean isSelected() {

		return this.selected;
	}
	
	protected void enableSelectionStyle(Graphics graphics) {
		
		graphics.setColor(Color.LIGHT_GRAY);
		Graphics2D g2 = (Graphics2D) graphics;
		float dash1[] = {2.0f};
		g2.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 2.0f, dash1, 0.0f));
	}

	protected void disableSelectionStyle(Graphics graphics) {
		graphics.setColor(color);
		Graphics2D g2 = (Graphics2D) graphics;
		g2.setStroke(new BasicStroke());
	}

	public void paint(Graphics graphics) {
		
		if (isSelected()) {
            enableSelectionStyle(graphics);
        }
        else {
            disableSelectionStyle(graphics);
        }
	}

}
