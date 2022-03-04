import java.util.ArrayList;

public class ZooDB {
	public static ArrayList<Animal> animalDB(ArrayList<Animal> animalList){
		animalList.add(new Animal("Tiger", "12D345EF", "Kitty", 5, true, "Needs Checkup"));
		return animalList;
	}
	
	public static ArrayList<Employee> employeeDB(ArrayList<Employee> employeeList){
		employeeList.add(new Employee("Bill Williams", "56F78GH", 32, "Lion Taming Specialist"));
		return employeeList;
	}
}
