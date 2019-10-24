
package behavioral.state.states;

import behavioral.state.context.Player;

public class LockedStateImpl extends StateImpl {

	public LockedStateImpl(Player player) {

		super(player);
		player.setPlaying(false);
	}

	public String onLock() {

		Player player = getPlayer();

		if (player.isPlaying()) {

			player.changeState(new ReadyStateImpl(player));
			return "Stop playing";
		}

		return locked();
	}

	public String onPlay() {

		getPlayer().changeState(new ReadyStateImpl(getPlayer()));
		return "Ready";
	}

	public String onNext() {

		return locked();
	}

	public String onPrevious() {

		return locked();
	}

	private String locked() {

		return "Locked ...";
	}

}
