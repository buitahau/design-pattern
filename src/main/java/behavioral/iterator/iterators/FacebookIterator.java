package behavioral.iterator.iterators;

import behavioral.iterator.entity.Profile;
import behavioral.iterator.social_networks.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HauKute on 11/4/2019.
 */
public class FacebookIterator implements ProfileIterator {

	private Facebook facebook;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<>();
	private List<Profile> profiles = new ArrayList<>();

	public FacebookIterator(Facebook facebook, String type, String email) {
		this.facebook = facebook;
		this.type = type;
		this.email = email;
	}

	private void lazyLoad() {
		if (emails.size() == 0) {
			List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.profiles.add(null);
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
		Profile friendProfile = profiles.get(currentPosition);
		if (friendProfile == null) {
			friendProfile = facebook.requestProfileFromFacebook(friendEmail);
			profiles.set(currentPosition, friendProfile);
		}
		currentPosition++;
		return friendProfile;
	}

	public void reset() {
		currentPosition = 0;
	}
}
