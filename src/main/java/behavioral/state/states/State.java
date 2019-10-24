package behavioral.state.states;


public interface State {

	String onLock();
	
	String onPlay();
	
	String onNext();
	
	String onPrevious();
}
