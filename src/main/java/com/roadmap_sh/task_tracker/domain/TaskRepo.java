package com.roadmap_sh.task_tracker.domain;

public interface TaskRepo {
	int addTask(Task t);

	void delete(Integer id);
}
