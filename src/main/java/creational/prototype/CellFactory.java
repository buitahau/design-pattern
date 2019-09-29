package creational.prototype;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by HauKute on 9/29/2019.
 */
public class CellFactory {

	private static Map<Color, Cell> mapCell = new EnumMap<>(Color.class);

	private CellFactory() {
	}

	public static Cell getInstance(Color color) {

		if (mapCell.get(color) == null) {
			mapCell.put(color, new Cell(color));
		}

		return mapCell.get(color).clone();
	}
}
