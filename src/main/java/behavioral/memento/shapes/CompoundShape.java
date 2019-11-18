package behavioral.memento.shapes;


import java.awt.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {

	private List<Shape> children = new ArrayList<>();

	public CompoundShape(Shape... components) {
		super(0, 0, Color.BLACK);
		add(components);
	}

	public void add(Shape component) {
		children.add(component);
	}

	public void add(Shape... components) {
		children.addAll(Arrays.asList(components));
	}

	public void remove(Shape child) {
		children.remove(child);
	}

	public void remove(Shape... components) {
		children.removeAll(Arrays.asList(components));
	}

	public void clear() {
		children.clear();
	}

	@Override
	public int getX() {
		if (children.size() == 0) {
			return 0;
		}

		int _x = children.get(0).getX();
		for (Shape child : children) {
			if (child.getX() < _x) {
				_x = child.getX();
			}
		}
		return _x;
	}

	@Override
	public int getY() {
		if (children.size() == 0) {
			return 0;
		}

		int _y = children.get(0).getY();
		for (Shape child : children) {
			if (child.getY() < _y) {
				_y = child.getY();
			}
		}
		return _y;
	}

	@Override
	public int getWidth() {
		int maxWidth = 0;
		int _x = getX();
		for (Shape child : children) {
			int childsRelativeX = child.getX() - _x;
			int childWidth = childsRelativeX + child.getWidth();
			if (childWidth > maxWidth) {
				maxWidth = childWidth;
			}
		}
		return maxWidth;
	}

	@Override
	public int getHeight() {
		int maxHeight = 0;
		int _y = getY();
		for (Shape child : children) {
			int childRelativeY = child.getY() - _y;
			int childHeight = childRelativeY + child.getHeight();
			if (childHeight > maxHeight) {
				maxHeight = childHeight;
			}
		}
		return maxHeight;
	}

	@Override
	public void drag() {
		invokeMethod("drag");
	}

	@Override
	public void drop() {
		invokeMethod("drop");
	}

	@Override
	public void moveTo(int x, int y) {
		invokeMethod("moveTo", x, y);
	}

	@Override
	public void moveBy(int x, int y) {
		invokeMethod("moveBy", x, y);
	}

	@Override
	public boolean isInsideBounds(int x, int y) {
		for (Shape child : children) {
			if (child.isInsideBounds(x, y)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setColor(Color color) {
		super.setColor(color);
//		invokeMethod("setColor", color);
		for (Shape child : children) {
			child.setColor(color);
		}
	}

	@Override
	public void unSelect() {
		super.unSelect();
//		invokeMethod("unSelect");
		for (Shape child : children) {
			child.unSelect();
		}
	}

	public Shape getChildAt(int x, int y) {
		for (Shape child : children) {
			if (child.isInsideBounds(x, y)) {
				return child;
			}
		}
		return null;
	}

	public boolean selectChilddAt(int x, int y) {
		Shape child = getChildAt(x, y);
		if (child != null) {
			child.select();
			return true;
		}
		return false;
	}

	public List<Shape> getSelected() {
		List<Shape> selected = new ArrayList<>();
		for (Shape child : children) {
			if (child.isSelected()) {
				selected.add(child);
			}
		}
		return selected;
	}

	@Override
	public void paint(Graphics graphics) {
		if (isSelected()) {
			enableSelectStyle(graphics);
			graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
			disableSelectionStyle(graphics);
		}

		for (Shape child : children) {
			child.paint(graphics);
		}
	}

	private void invokeMethod(String methodName, Object... parameters) {

		try {
			for (Shape child : children) {
				Method method = child.getClass().getDeclaredMethod(methodName);
				method.invoke(child, parameters);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
