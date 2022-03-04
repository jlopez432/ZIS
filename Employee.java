
public class Employee {
	private String name; 
	private String employeeID;
	private int age;
	private String jobTitle;
	
	public Employee (String name, String employeeID, int age, String jobTitle){
		this.name = name;
		this.employeeID = employeeID;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	
	public int getAge(){
		return age;
	}
	
	public String getJobTitle(){
		return jobTitle;
	}
}
