package com.roadmap_sh.task_tracker.infrastructure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roadmap_sh.task_tracker.domain.Task;

public class FileTaskRepoTest {
	private FileTaskRepo fileTaskRepo;
	
	@Before
	public void init() {
		fileTaskRepo = new FileTaskRepo();
	}
	
	@Test
	public void testAddRepo() {
		fileTaskRepo.clean();
		fileTaskRepo.addTask(new Task("new description 0"));
		assertEquals(1, fileTaskRepo.getTasks().size());
		
		fileTaskRepo.addTask(new Task("new description 1"));
		assertEquals(2, fileTaskRepo.getTasks().size());
		assertEquals((Integer)2, fileTaskRepo.getTasks().get(1).getId());
	}
	
	@Test
	public void testDelete() {
		fileTaskRepo.clean();
		fileTaskRepo.addTask(new Task("new description 0"));
		
		fileTaskRepo.addTask(new Task("new description 1"));
		
		fileTaskRepo.delete(1);
		assertEquals(1, fileTaskRepo.getTasks().size());
	}
}
