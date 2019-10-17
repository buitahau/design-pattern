package behavioral.observer.subscriber;

import java.io.File;

public class LogOpenListener implements EventListener {

	private File log;

	public LogOpenListener(String fileName) {
		this.log = new File(fileName);
	}

	public void update(String eventType, File file) {

		System.out.println("Save to log "
				.concat(log.getName())
				.concat(": Someone has performed ")
				.concat(eventType)
				.concat(" operation with the following file: ")
				.concat(file.getName()));
	}

}
