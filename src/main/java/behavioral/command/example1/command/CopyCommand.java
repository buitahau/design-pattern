package behavioral.command.example1.command;

import behavioral.command.example1.editor.Editor;

public class CopyCommand extends Command{

	public CopyCommand(Editor editor) {

		super(editor);
	}

	@Override
	public boolean execute() {

		editor.clipboard = editor.textField.getSelectedText();
		return true;
	}

}
