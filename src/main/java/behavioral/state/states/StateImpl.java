
package behavioral.state.states;

import behavioral.state.context.Player;

public abstract class StateImpl implements State {

	private Player player;

	/**
	 * Context passes itself through the state constructor. This may help a
	 * state to fetch some useful context data if needed.
	 */
	protected StateImpl(Player player) {

		this.player = player;
	}

	public Player getPlayer() {

		return player;
	}
}
