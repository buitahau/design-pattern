package structural.flyweight.extrinsic;

import structural.flyweight.intrinsic.TreeType;
import structural.flyweight.intrinsic.TreeTypeFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HauKute on 10/16/2019.
 */
public class Forest extends JFrame {
	private List<Tree> trees = new ArrayList<Tree>();

	public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
		TreeType type = TreeTypeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}

	@Override
	public void paint(Graphics g) {
		for (Tree tree : trees) {
			tree.draw(g);
		}
	}
}
