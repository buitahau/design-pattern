package structural.flyweight.intrinsic;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HauKute on 10/16/2019.
 */
public class TreeTypeFactory {
	private static Map<String, TreeType> treeTypes = new HashMap<String, TreeType>();

	private TreeTypeFactory() {

	}

	public static TreeType getTreeType(String name, Color color, String otherTreeData) {
		TreeType result = treeTypes.get(name);
		if (result == null) {
			result = new TreeType(name, color, otherTreeData);
			treeTypes.put(name, result);
		}
		return result;
	}
}
