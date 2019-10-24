
package behavioral.state.context;

import java.util.ArrayList;
import java.util.List;

import behavioral.state.states.ReadyStateImpl;
import behavioral.state.states.State;

public class Player {

	private State state;
	private boolean playing = true;
	private List<String> playList = new ArrayList<String>();
	private int currentTrack = 0;

	public Player() {

		this.state = new ReadyStateImpl(this);
		setPlaying(true);
		for (int i = 0; i <= 12; i++) {
			playList.add("Track " + i);
		}
	}

	public void changeState(State state) {

		this.state = state;
	}

	public State getState() {

		return state;
	}

	public void setPlaying(boolean playing) {

		this.playing = playing;
	}

	public boolean isPlaying() {

		return playing;
	}

	public String startPlayback() {

		return getCurrentTrack();
	}

	public String nextTrack() {

		currentTrack++;
		if (currentTrack > maxPlaylist()) {
			currentTrack = 0;
		}
		return getCurrentTrack();
	}

	public String previousTrack() {

		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = maxPlaylist();
		}
		return getCurrentTrack();
	}

	public void setCurrentTrackAfterStop() {

		this.currentTrack = 0;
	}

	private String getCurrentTrack() {

		return "Playing " + playList.get(currentTrack);
	}

	private int maxPlaylist() {

		return playList.size() - 1;
	}
}
