package structural.flyweight.extrinsic;

import structural.flyweight.intrinsic.TreeType;

import java.awt.*;

/**
 * Created by HauKute on 10/16/2019.
 */
public class Tree {
	private int x;
	private int y;
	private TreeType type;

	public Tree(int x, int y, TreeType treeType) {
		this.x = x;
		this.y = y;
		this.type = treeType;
	}

	public void draw(Graphics graphics) {
		type.draw(graphics, x, y);
	}
}
