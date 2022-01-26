package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import Task.taskService;

public class TaskServiceTest {
	private String taskID, taskName, taskDescription;
	@BeforeEach
	void setUp() {
		taskID = "0001";
		taskName = "Task name";
		taskDescription = "Task description";
	}
	@Test
	void newTaskIdTest() {
		taskService service = new taskService();
		service.newTaskID();
		Assertions.assertNotNull(service.getListOfTask().get(0).getTaskID());
		Assertions.assertNotEquals(taskID,  service.getListOfTask().get(0).getTaskID());
	}
	@Test
	void newTaskNameTest() {
		taskService service = new taskService();
		service.newTaskID();
		Assertions.assertNotNull(service.getListOfTask().get(0).getName());
		Assertions.assertNotEquals(taskName, service.getListOfTask().get(0).getName());
	}
	@Test
	void newTaskDescriptionTest() {
		taskService service = new taskService();
		service.newTaskID();
		Assertions.assertNotNull(service.getListOfTask().get(0).getName());
		Assertions.assertNotEquals(taskDescription, service.getListOfTask().get(0).getDescription());
		}
	
	@Test
	void newLongTaskNameTest() {
		taskService service = new taskService();
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> service.newTaskID());
	}
	@Test
	void newLongTaskDescriptionTest() {
		taskService service = new taskService();
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> service.newTaskID());
	}
	
	@Test
	void newNullTaskNameTest() {
		taskService service = new taskService();
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> service.newTaskID());
	}
	@Test
	void newNullTaskDecriptionTest() {
		taskService service = new taskService();
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> service.newTaskID());
	}
	
	@Test
	void updateTaskNameTest() throws Exception {
		taskService service = new taskService();
		service.newTaskID();
		service.updateName(service.getListOfTask().get(0).getTaskID(), taskName);
		assertEquals(taskName, service.getListOfTask().get(0).getName());
	}
	@Test
	void updateTaskDescriptionTest() throws Exception {
		taskService service = new taskService();
		service.newTaskID();
		service.updateDescription(service.getListOfTask().get(0).getTaskID(), taskDescription);
		assertEquals(taskDescription, service.getListOfTask().get(0).getDescription());
		}
	
	@Test
	void deleteTaskTest() throws Exception {
		taskService service = new taskService();
		service.newTaskID();
		
	}
	
	

}
