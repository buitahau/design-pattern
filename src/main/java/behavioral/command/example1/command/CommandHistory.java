package behavioral.command.example1.command;


import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<Command>();

	public void push(Command c){
		history.push(c);
	}

	public Command pop() {
		return history.pop();
	}

	public boolean isEmpty() {
		return history.isEmpty();
	}

}
