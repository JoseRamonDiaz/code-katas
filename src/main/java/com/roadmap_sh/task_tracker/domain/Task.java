package com.roadmap_sh.task_tracker.domain;

public class Task {
	private Integer id;
	private final String description;
	
	public Task(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public Task(String description) {
		this.description = description;
	}
	
	public Task() {
		this.description = "";
	}

	public Task(Task task) {
		this.id = task.id;
		this.description = task.description;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
