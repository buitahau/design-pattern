package behavioral.strategy.strategies;

import java.util.List;

/**
 * Created by HauKute on 10/19/2019.
 */
public interface SortStrategy {
	<T> void sort(List<T> items);
}
