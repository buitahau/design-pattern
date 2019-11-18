
package behavioral.memento.commands;

import java.awt.Color;

import behavioral.memento.editor.Editor;
import behavioral.memento.shapes.Shape;

public class ColorCommand extends BaseCommand {

	private Color color;

	public ColorCommand(Editor editor, Color color) {

		super(editor);
		this.color = color;
	}

	@Override
	public String getName() {

		return "Colorize: " + color.toString();
	}
	
	@Override
	public void execute() {
		for(Shape child: editor.getShapes().getSelected()) {
			child.setColor(color);
		}
	}
}
