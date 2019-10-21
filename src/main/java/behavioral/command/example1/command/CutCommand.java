package behavioral.command.example1.command;

import behavioral.command.example1.editor.Editor;

/**
 * Created by HauKute on 10/21/2019.
 */
public class CutCommand extends Command {
	public CutCommand(Editor editor) {
		super(editor);
	}

	public boolean execute() {
		if(editor.textField.getSelectedText() == null || editor.textField.getSelectedText().trim().length() == 0) {
			return false;
		}
		backup();
		String source = editor.textField.getText();
		editor.clipboard = editor.textField.getSelectedText();
		editor.textField.setText(cutString(source));
		return true;
	}

	private String cutString(String source) {
		String start = source.substring(0, editor.textField.getSelectionStart());
		String end = source.substring(editor.textField.getSelectionEnd());
		return start + end;
	}
}
