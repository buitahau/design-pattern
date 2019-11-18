
package behavioral.memento.commands;

import behavioral.memento.editor.Editor;

public abstract class BaseCommand implements Command {

	protected Editor editor;

	protected BaseCommand(Editor editor) {

		this.editor = editor;
	}

}
