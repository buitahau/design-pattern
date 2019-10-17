package behavioral.observer;

import behavioral.observer.publisher.Editor;
import behavioral.observer.subscriber.EmailNotificationListener;
import behavioral.observer.subscriber.LogOpenListener;

public class Demo {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
		editor.subscribe("save", new EmailNotificationListener("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
