package behavioral.iterator.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HauKute on 11/2/2019.
 */
public class Profile {
	private String name;
	private String email;
	private Map<String, List<String>> contacts = new HashMap<>();

	public Profile(String email, String name, String... contacts) {
		this.email = email;
		this.name = name;

		for (String contact : contacts) {
			String[] parts = contact.split(":");
			String contextType = "friend", contactEmail;
			if (parts.length == 1) {
				contactEmail = parts[0];
			} else {
				contextType = parts[0];
				contactEmail = parts[1];
			}
			if (!this.contacts.containsKey(contextType)) {
				this.contacts.put(contextType, new ArrayList<>());
			}
			this.contacts.get(contextType).add(contactEmail);
		}
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public List<String> getContacts(String contactType) {
		return this.contacts.get(contactType);
	}
}
