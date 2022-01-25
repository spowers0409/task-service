package Task;

import java.util.*;

public class taskService {
	private final List<task> listOfTask = new ArrayList<>();
	
	// Create a unique ID number of which is not longer than 10
	public String newTaskID() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	
	// Allow to search ID numbers otherwise throw an exception
	private task searchForTask(String taskID) throws Exception {
		int i = 0;
		
		while (i < listOfTask.size()) {
			if (taskID.equals(listOfTask.get(i).getTaskID())) {
				return listOfTask.get(i);
			}
			i++;
		}
		throw new Exception("No ID");
	}
	
	// Add new task with new name and description
	public void addTask(String name, String description) {
		task task = new task(newTaskID(), name, description);
		listOfTask.add(task);
	}
	// Delete task by ID number
	public void deleteTask(String taskID) throws Exception {
		listOfTask.remove(searchForTask(taskID));
	}
	// Update name of taskID
	public void updateName(String taskID, String name) throws Exception {
		searchForTask(taskID).setName(name);
	}
	// Update description of taskID
	public void updateDescription(String taskID, String description) throws Exception {
		searchForTask(taskID).setDescription(description);
	}
	
	public List<task>getListOfTask() {
		return listOfTask;
	}

}
