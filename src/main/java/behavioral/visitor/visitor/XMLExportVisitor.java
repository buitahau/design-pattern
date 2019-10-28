package behavioral.visitor.visitor;

import java.lang.reflect.Method;
import behavioral.visitor.element.*;

public class XMLExportVisitor implements Visitor {

	public String export(Shape... shapes) {

		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
		for (Shape shape : shapes) {
			sb.append(shape.accept(this)).append("\n");

		}
		return sb.toString();
	}

	public String visit(Shape shape) {

		Method method = getMethod(shape.getClass());
		if (method == null) {
			return defaultVisit(shape);
		}
		else {
			try {
				return (String) method.invoke(this, shape);
			}
			catch (Exception e) {

			}
			return "null";
		}
	}

	private String defaultVisit(Shape shape) {

		return "<default_shape></default_shape>";
	}

	public String visit(Dot dot) {

		return buildTag("dot", new String[] {
			buildTag(TAG_ID, dot.getId()),
			buildTag(TAG_X, dot.getX()),
			buildTag(TAG_Y, dot.getY())
		});
	}

	public String visit(Circle circle) {

		return buildTag("circle", new String[] {
				buildTag(TAG_ID, circle.getId()),
				buildTag(TAG_X, circle.getX()),
				buildTag(TAG_Y, circle.getY()),
				buildTag("radius", circle.getRadius())
		});
	}

	public String visit(Rectangle rectangle) {

		return buildTag("rectangle", new String[] {
				buildTag(TAG_ID, rectangle.getId()),
				buildTag(TAG_X, rectangle.getX()),
				buildTag(TAG_Y, rectangle.getY()),
				buildTag("width", rectangle.getWidth()),
				buildTag("height", rectangle.getHeight())
		});
	}

	public String visit(CompoundShape compoundShape) {

		return buildTag("compound_graphic", new String[] {
				buildTag(TAG_ID, compoundShape.getId()),
				_visitCompoundGraphic(compoundShape)
		});
	}

	private String _visitCompoundGraphic(CompoundShape compoundShape) {

		StringBuilder sb = new StringBuilder();
		for (Shape shape : compoundShape.children) {
			String obj = shape.accept(this);
			obj = "    " + obj.replace("\n", "\n    ") + "\n";
			sb.append(obj);
		}
		return sb.toString();
	}

	private String buildTag(String tag, Object value){
		return String.format("<%s>%s</%s>\n", tag, String.valueOf(value), tag);
	}

	private String buildTag(String tag, String[] elements) {
		return  String.format("<%s>\n%s</%s>\n", tag, String.join("", elements), tag);
	}

	private Method getMethod(Class<?> clazz) {

		while (!clazz.equals(Object.class)) {
			try {

				Method method =
						this.getClass().getDeclaredMethod(OPERATION_VISIT, clazz);

				return method;
			}
			catch (NoSuchMethodException ex) {

				clazz = clazz.getSuperclass();
			}
		}

		Class<?>[] interfaces = clazz.getInterfaces();

		for (Class<?> anInterface : interfaces) {
			try {

				Method method = this.getClass().getDeclaredMethod(
						OPERATION_VISIT, anInterface);

				return method;
			}
			catch (NoSuchMethodException ex) {

				ex.printStackTrace();
			}
		}

		return null;
	}

	private final static String OPERATION_VISIT = "visit";
	private final static String TAG_ID = "id";
	private final static String TAG_X = "x";
	private final static String TAG_Y = "y";
}
