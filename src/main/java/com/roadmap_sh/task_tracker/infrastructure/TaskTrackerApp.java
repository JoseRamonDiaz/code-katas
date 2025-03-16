package com.roadmap_sh.task_tracker.infrastructure;

public class TaskTrackerApp {

	public static void main(String[] args) {
		Command c = new InvalidCommand(args[0]);
		
		if (args[0].equals("add")) {
			c = new AddCommand(args[1]);
		}
		
		if (args[0].equals("delete")) {
			c = new DeleteCommand(args[1]);
		}
		
		c.execute();
	}

}
