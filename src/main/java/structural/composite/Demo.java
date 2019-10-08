package structural.composite;

import structural.composite.compound.CompoundShape;
import structural.composite.editor.ImageEditor;
import structural.composite.shapes.*;
import structural.composite.shapes.Rectangle;
import structural.composite.shapes.Shape;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by HauKute on 10/9/2019.
 */
public class Demo {
	public static void main(String[] args) {
		ImageEditor editor = new ImageEditor();

		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(10, 10, 10, Color.BLUE));
		shapes.add(new CompoundShape(
				new Circle(110, 110, 50, Color.RED),
				new Dot(160, 160, Color.RED)
		));
		shapes.add(new CompoundShape(
				new Rectangle(250, 250, 100, 100, Color.GREEN),
				new Dot(240, 240, Color.GREEN),
				new Dot(240, 360, Color.GREEN),
				new Dot(360, 360, Color.GREEN),
				new Dot(360, 240, Color.GREEN)
		));

		editor.loadShapes(shapes);
	}
}
