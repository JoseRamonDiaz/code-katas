package com.roadmap_sh.task_tracker.infrastructure;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roadmap_sh.task_tracker.domain.Task;
import com.roadmap_sh.task_tracker.domain.TaskRepo;

public class FileTaskRepo implements TaskRepo {
	private final ObjectMapper mapper;
	private List<Task> tasks;
	
	public FileTaskRepo() {
		this.mapper = new ObjectMapper();
		readTasksFromFile();
	}

	@Override
	public int addTask(Task t) {
		Integer nextId = 1;
		
		if (!tasks.isEmpty()) {
			nextId = tasks.getLast().getId() + 1;
		}
		
		t.setId(nextId);
		tasks.add(t);
		try {
			mapper.writeValue(new File("tasks.json"), tasks);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return nextId;
	}

	public List<Task> getTasks() {
		readTasksFromFile();
		List<Task> copy = new ArrayList<>();
        for (Task task : tasks) {
            copy.add(new Task(task));
        }
        return copy;
	}

	protected void clean() {
		try (PrintWriter writer = new PrintWriter(new FileWriter("tasks.json"))) {
			tasks.clear();
            // Writing nothing clears the file
            // The file is opened in write mode, so previous content is cleared
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void delete(Integer id) {
		tasks.removeIf(t -> t.getId().equals(id));
		try {
			mapper.writeValue(new File("tasks.json"), tasks);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readTasksFromFile() {
		try {
			tasks = mapper.readValue(new File("tasks.json"), new TypeReference<List<Task>>() {});
			tasks.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));
		} catch (IOException e) {
			//when nothing is in the file start an empty list
			tasks = new ArrayList<Task>();
		}
	}

}
