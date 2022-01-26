package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Task.task;

public class TaskTest {
	
	// Test class to test for length and null of ID, name and description
	
	// Getters
	@Test
	void testGetTaskID() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertEquals("0001", task.getTaskID());
	}
	@Test
	void getTestName() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertEquals("Task name", task.getName());
	}
	@Test
	void testGetDescription() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertEquals("Really descriptive task", task.getDescription());
	}
	
	// Setters
	@Test
	void testSetTaskID() {
		task task = new task("0001", "Task name", "Really descriptive task");
		task.setName("Task name");
		Assertions.assertEquals("0001", task.getTaskID());
	}
	@Test
	void testSetName() {
		task task = new task("0001", "Task name", "Really descriptive task");
		task.setName("Task name");
		Assertions.assertEquals("Task name", task.getName());
	}
	@Test
	void setDescription() {
		task task = new task("0001", "Task name", "Really descriptive task");
		task.setDescription("Really descriptive task");
		Assertions.assertEquals("Really descriptive task", task.getDescription());
	}
	
	// Testing for length errors
	@Test
	void testTaskIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> new task("00000111111", "Task name", "Really descriptive task"));
	}
	@Test
	void testNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> new task("0001", "Task name is too long here", "Really descriptive task"));
	}
	@Test 
	void testDescriptionLength() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> new task("0001", "Task name", "Really descriptive task is really really really long here and needs to be much shorter"));
	}
	
	// Testing for being null
	@Test
	void testTasIDNull() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> task.setTaskID(null));
	}
	@Test
	void testTaskNameNull() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> task.setName(null));
	}
	@Test
	void testTaskDescriptionNull() {
		task task = new task("0001", "Task name", "Really descriptive task");
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> task.setDescription(null));
	}
	

}
