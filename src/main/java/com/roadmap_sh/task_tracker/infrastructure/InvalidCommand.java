package com.roadmap_sh.task_tracker.infrastructure;

public class InvalidCommand implements Command {
	private String s;
	
	public InvalidCommand(String s) {
		this.s = s;
	}

	@Override
	public void execute() {
		System.out.println("Invalid command " + s);
	}

}
