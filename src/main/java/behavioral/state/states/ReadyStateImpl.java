
package behavioral.state.states;

import behavioral.state.context.Player;

public class ReadyStateImpl extends StateImpl {

	public ReadyStateImpl(Player player) {

		super(player);
	}

	public String onLock() {

		Player player = getPlayer();
		player.changeState(new LockedStateImpl(player));
		return "Locked ...";
	}

	public String onPlay() {

		Player player = getPlayer();
		String action = player.startPlayback();
		player.changeState(new PlayingStateImpl(player));
		return action;
	}

	public String onNext() {

		return "Locked ...";
	}

	public String onPrevious() {

		return "Locked ...";
	}

}
