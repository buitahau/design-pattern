package behavioral.strategy.context;

import behavioral.strategy.strategies.SortStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HauKute on 10/19/2019.
 */
public class SortedList {
	private SortStrategy sortStrategy;
	private List<String> items = new ArrayList<String>();

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void add(String name) {
		this.items.add(name);
	}

	public void sort() {
		this.sortStrategy.sort(this.items);
	}
}
