package behavioral.state;

import behavioral.state.context.Player;
import behavioral.state.ui.UI;

/**
 * Created by HauKute on 10/25/2019.
 */
public class Demo {
	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();
	}
}
