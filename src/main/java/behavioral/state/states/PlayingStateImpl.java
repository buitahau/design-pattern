
package behavioral.state.states;

import behavioral.state.context.Player;

public class PlayingStateImpl extends StateImpl {

	public PlayingStateImpl(Player player) {

		super(player);
	}

	public String onLock() {

		Player player = getPlayer();
		player.changeState(new LockedStateImpl(player));
		player.setCurrentTrackAfterStop();
		return "Stop playing";
	}

	public String onPlay() {

		getPlayer().changeState(new ReadyStateImpl(getPlayer()));
		return "Paused...";
	}

	public String onNext() {

		return getPlayer().nextTrack();
	}

	public String onPrevious() {

		return getPlayer().previousTrack();
	}
}
