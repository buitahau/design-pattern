
package behavioral.command.example2.command;

import behavioral.command.example2.document.Document;

public class DocumentEditorCommand implements Command {

	private Document document;
	private String text;

	public DocumentEditorCommand(Document document, String text) {

		this.document = document;
		this.text = text;
		this.document.write(text);
	}

	public void undo() {

		document.eraseLast();
	}

	public void redo() {

		document.write(text);

	}

}
