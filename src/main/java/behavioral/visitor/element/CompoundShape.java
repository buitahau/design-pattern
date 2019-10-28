package behavioral.visitor.element;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape extends ShapeImpl {

	public List<Shape> children = new ArrayList<Shape>();

	public CompoundShape(int id) {

		super(id, 0, 0);
	}

	public void add(Shape shape) {

		children.add(shape);
	}

}
