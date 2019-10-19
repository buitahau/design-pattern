package behavioral.strategy;

import behavioral.strategy.context.SortedList;
import behavioral.strategy.strategies.MergeSort;
import behavioral.strategy.strategies.QuickSort;
import behavioral.strategy.strategies.SelectionSort;

/**
 * Created by HauKute on 10/19/2019.
 */
public class Demo {
	public static void main(String[] args) {
		SortedList sortedList = new SortedList();
		sortedList.add("Java Core");
		sortedList.add("Java Design Pattern");
		sortedList.add("Java Library");
		sortedList.add("Java Framework");

		sortedList.setSortStrategy(new QuickSort());
		sortedList.sort();

		sortedList.setSortStrategy(new MergeSort());
		sortedList.sort();

		sortedList.setSortStrategy(new SelectionSort());
		sortedList.sort();
	}
}
