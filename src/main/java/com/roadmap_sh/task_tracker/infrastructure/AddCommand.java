package com.roadmap_sh.task_tracker.infrastructure;

import com.roadmap_sh.task_tracker.application.AddTask;
import com.roadmap_sh.task_tracker.domain.Task;
import com.roadmap_sh.task_tracker.domain.TaskRepo;

public class AddCommand implements Command{
	private TaskRepo taskRepo = new FileTaskRepo();
	private String arg;
	
	public AddCommand(String arg) {
		this.arg = arg;
	}
	
	@Override
	public void execute() {
		if (arg == null || arg.isBlank()) {
			return;
		}
		
		AddTask addTask = new AddTask(taskRepo);
		addTask.addTask(new Task(arg));
	}

}
