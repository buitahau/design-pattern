
package behavioral.memento.editor;

import javax.swing.JComponent;

import behavioral.memento.commands.Command;
import behavioral.memento.history.History;
import behavioral.memento.history.Memento;
import behavioral.memento.shapes.CompoundShape;
import behavioral.memento.shapes.Shape;

import java.io.*;
import java.util.Base64;

public class Editor extends JComponent {

	private Canvas canvas;
	private CompoundShape allShapes = new CompoundShape();
	private History history;

	public Editor() {

		canvas = new Canvas(this);
		history = new History();
	}

	public void loadShapes(Shape... shapes) {
		allShapes.clear();
		allShapes.add(shapes);
		canvas.refresh();
	}

	public CompoundShape getShapes() {

		return allShapes;
	}

	public void execute(Command command) {
		history.push(command, new Memento(this));
		command.execute();
	}

	public void undo() {
		if (history.undo()) {
			canvas.repaint();
		}
	}

	public void redo() {
		if (history.redo()) {
			canvas.repaint();
		}
	}

	public String backup() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this.allShapes);
			oos.close();
			return Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch (IOException e) {
			System.out.println("Backup IOException occurred.");
			return "";
		}
	}

	public void restore(String state) {
		try {
			byte[] data = Base64.getDecoder().decode(state);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			this.allShapes = (CompoundShape) ois.readObject();
			ois.close();
		} catch (IOException e) {
			System.out.println("IOException occurred.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Class Not Found occurred.");
		}
	}
}
