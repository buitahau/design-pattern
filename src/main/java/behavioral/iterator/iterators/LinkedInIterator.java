package behavioral.iterator.iterators;

import behavioral.iterator.entity.Profile;
import behavioral.iterator.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HauKute on 11/4/2019.
 */
public class LinkedInIterator implements ProfileIterator {

	private LinkedIn linkedIn;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<>();
	private List<Profile> contacts = new ArrayList<>();

	public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
		this.linkedIn = linkedIn;
		this.email = email;
		this.type = type;
	}

	private void lazyLoad() {
		if (emails.size() == 0) {
			List<String> profiles = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.contacts.add(null);
			}
		}
	}

	public boolean hasNext() {
		lazyLoad();
		return currentPosition < emails.size();
	}

	public Profile getNext() {
		if (!hasNext()) {
			return null;
		}

		String friendEmail = emails.get(currentPosition);
		Profile friendContact = contacts.get(currentPosition);
		if (friendContact == null) {
			friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
			contacts.set(currentPosition, friendContact);
		}
		currentPosition++;
		return friendContact;
	}

	public void reset() {
		currentPosition = 0;
	}
}
