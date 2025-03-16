package com.roadmap_sh.task_tracker.infrastructure;

import com.roadmap_sh.task_tracker.application.DeleteTask;
import com.roadmap_sh.task_tracker.domain.TaskRepo;


public class DeleteCommand implements Command {
	private TaskRepo taskRepo = new FileTaskRepo();
	private Integer idToDelete;

	public DeleteCommand(String id) {
		this.idToDelete = Integer.parseInt(id);
	}
	
	@Override
	public void execute() {
		DeleteTask deleteTask = new DeleteTask(taskRepo);
		deleteTask.delete(idToDelete);
	}

}
