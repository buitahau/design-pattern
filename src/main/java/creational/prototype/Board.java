package creational.prototype;

/**
 * Created by HauKute on 9/29/2019.
 */
public class Board {
	private final int NUM_OF_ROW = 8;
	private final int NUM_OF_COL = 8;
	private final Cell[][] board = new Cell[NUM_OF_ROW][NUM_OF_COL];

	public Board() {
		for (int x = 0; x < NUM_OF_ROW; x++) {
			for (int y = 0; y < NUM_OF_COL; y++) {
				Cell cell = CellFactory.getInstance(getColor(x, y));
				cell.setCoordinator(x, y);
				board[x][y] = cell;
			}
		}
	}

	public void display() {
		for (int x = 0; x < NUM_OF_ROW; x++) {
			for (int y = 0; y < NUM_OF_COL; y++) {
				System.out.println(board[x][y].toString());
			}
		}
	}

	public static Color getColor(int coor_x, int coor_y) {
		if ((coor_x + coor_y) % 2 == 0) {
			return Color.WHITE;
		}
		return Color.BLACK;
	}
}
