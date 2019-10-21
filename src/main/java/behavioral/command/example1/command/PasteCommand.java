package behavioral.command.example1.command;

import behavioral.command.example1.editor.Editor;

/**
 * Created by HauKute on 10/21/2019.
 */
public class PasteCommand extends Command{
	public PasteCommand(Editor editor) {
		super(editor);
	}

	public boolean execute() {
		if(editor.clipboard == null || editor.clipboard.trim().length() == 0) {
			return false;
		}
		backup();
		editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
		return true;
	}
}
