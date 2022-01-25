package Task;

public class task {
	private String taskID;			// No longer than 10
	private String name;			// No longer than 20 
	private String description;		// No longer than 50
	
	public task(String taskID, String name, String description) {
		// verifies that taskID will not be null or longer than 10 characters
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid");
		}
		// verifies that name will not be null or longer than 20 characters
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid");
		}
		// verifies that description will not be null or longer than 50 characters
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid");
		}
		
		this.taskID = taskID;
		this.name = name;
		this.description = description;
	}
	
	// Getters and setters
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	public void setTaskID(String taskID) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid task ID");
		}
		else {
			this.taskID = taskID;
		}
	}
	
	public void setName(String name) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		else {
			this.name = name;
		}				
	}
	
	public void setDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		else {
			this.description = description;
		}
	}
}
	
