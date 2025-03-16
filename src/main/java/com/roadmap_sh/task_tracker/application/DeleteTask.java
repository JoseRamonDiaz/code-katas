package com.roadmap_sh.task_tracker.application;

import com.roadmap_sh.task_tracker.domain.TaskRepo;

public class DeleteTask {
	private final TaskRepo taskRepo;
	
	public DeleteTask(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	public void delete(Integer id) {
		this.taskRepo.delete(id);
	}
}
