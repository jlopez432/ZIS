import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZISFrontEnd {
	private static ArrayList<Animal> animalList = new ArrayList<>();
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	private static String animalInfo;
	private static String employeeInfo;
	
	public ZISFrontEnd(){
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createEmptyBorder(50, 50, 20, 50));
		label.setForeground(Color.cyan);
		label.setText("Animal(s) : " + animalInfo);
		
		JLabel label2 = new JLabel();
		label2.setBorder(BorderFactory.createEmptyBorder(50, 50, 20, 50));
		label2.setForeground(Color.cyan);
		label2.setText("Employee(s) : " + employeeInfo);
		
		JPanel screen = new JPanel();
		screen.setBorder(BorderFactory.createEmptyBorder(100, 100, 30, 100));
		screen.setLayout(new GridLayout(0, 1));
		screen.add(label);
		screen.add(label2);
		screen.setBackground(Color.DARK_GRAY);
		
		JFrame frame = new JFrame();
		frame.add(screen, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Zoo Information System");
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
		
	}
	public static void main(String[] args){
		accessAnimalDB();
		accessEmployeeDB();
		
		getAnimalList(animalList);
		getEmployeeList(employeeList);
		new ZISFrontEnd();
	}
	
	public static void accessAnimalDB(){
		animalList = ZooDB.animalDB(animalList);
	}
	
	public static void accessEmployeeDB(){
		employeeList = ZooDB.employeeDB(employeeList);
	}
	
	public static void getAnimalList(ArrayList<Animal> animalList){
		for (Animal animal : animalList){
			String breed = animal.getBreed();
			String animalID = animal.getAnimalID();
			String animalName = animal.getName();
			int animalAge = animal.getAge();
			boolean beenFed = animal.getBeenFed();
			String health = animal.getHealth();
			
			animalInfo = (animalName + " " + animalID + " - " + breed + ", " + animalAge + ", Fed = " + beenFed + ", " + health);
		}
	}
	
	public static void getEmployeeList(ArrayList<Employee> employeeList){
		for (Employee employee : employeeList){
			String employeeName = employee.getName();
			String employeeID = employee.getEmployeeID();
			int employeeAge = employee.getAge();
			String jobTitle = employee.getJobTitle();
			
			employeeInfo = (employeeName + " " + employeeID + " - " + jobTitle + ", " + employeeAge);
		}
	}
}
