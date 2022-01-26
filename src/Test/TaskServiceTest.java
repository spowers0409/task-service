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
	

}
