package behavioral.iterator.iterators;

import behavioral.iterator.entity.Profile;

/**
 * Created by HauKute on 11/4/2019.
 */
public interface ProfileIterator {
	boolean hasNext();

	Profile getNext();

	void reset();
}
