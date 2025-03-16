package com.roadmap_sh.task_tracker.application;

import com.roadmap_sh.task_tracker.domain.Task;
import com.roadmap_sh.task_tracker.domain.TaskRepo;

public class AddTask {
	private final TaskRepo taskRepo;
	
	public AddTask(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	public int addTask(Task t) {
		return taskRepo.addTask(t);
	}
}
