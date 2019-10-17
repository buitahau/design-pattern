package behavioral.observer.subscriber;

import java.io.File;

public class EmailNotificationListener implements EventListener {

	private String email;

	public EmailNotificationListener(String email) {
		this.email = email;
	}

	public void update(String eventType, File file) {

		System.out.println("Email to "
				.concat(email)
				.concat(": Someone has performed ")
				.concat(eventType)
				.concat(" operation with the following file: ")
				.concat(file.getName()));
	}

}
