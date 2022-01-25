package Task;

public class task {
	private String taskID;			// No longer than 10
	private String name;			// No longer than 20 
	private String description;		// No longer than 50
	
	public task(String taskID, String name, String description) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid");
		}
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid");
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid");
		}
		
		this.taskID = taskID;
		this.name = name;
		this.description = description;
	}
	
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
	
