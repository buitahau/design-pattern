package behavioral.observer.publisher;

import behavioral.observer.subscriber.EventListener;

import java.io.File;

public class Editor {
	private EventManager events;
	private File file;

	public Editor() {
		this.events = new EventManager("open", "save");
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		this.events.notify("open", file);
	}

	public void saveFile() throws Exception {
		if (this.file != null) {
			events.notify("save", file);
		} else {
			throw new Exception("Please open a file first");
		}
	}

	public void subscribe(String eventType, EventListener listener) {
		this.events.subscribe(eventType, listener);
	}

	public void unsubscribe(String eventType, EventListener listener) {
		this.events.unsubscribe(eventType, listener);
	}
}
