package com.roadmap_sh.task_tracker.infrastructure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TaskTrackerAppTest {
	private FileTaskRepo taskRepo;
	
	@Before
	public void init() {
		taskRepo = new FileTaskRepo();
	}
	
	@Test
	public void testAddTask() throws InterruptedException {
		taskRepo.clean();
		TaskTrackerApp.main(new String[]{"add", "Description 0"});
		TaskTrackerApp.main(new String[]{"add", "Description 1"});
		TaskTrackerApp.main(new String[]{"lksdjf", "Description 1"});
		assertEquals(2, taskRepo.getTasks().size());
	}
	
	@Test
	public void testDeleteTask() throws InterruptedException {
		taskRepo.clean();
		TaskTrackerApp.main(new String[]{"add", "Description 0"});
		TaskTrackerApp.main(new String[]{"add", "Description 1"});
		TaskTrackerApp.main(new String[]{"lksdjf", "Description 1"});
		assertEquals(2, taskRepo.getTasks().size());
		
		TaskTrackerApp.main(new String[]{"delete", "1"});
		assertEquals(1, taskRepo.getTasks().size());
	}
}
