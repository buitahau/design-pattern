package behavioral.iterator.social_networks;

import behavioral.iterator.iterators.ProfileIterator;

/**
 * Created by HauKute on 11/4/2019.
 */
public interface SocialNetwork {

	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);
}
