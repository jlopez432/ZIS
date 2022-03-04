
public class Animal {
	private String breed; 
	private String animalID;
	private String name;
	private int age;
	private boolean beenFed;
	private String health;
	
	public Animal (String breed, String animalID, String name, int age, boolean beenFed, String health){
		this.breed = breed;
		this.animalID = animalID;
		this.name = name;
		this.age = age;
		this.beenFed = beenFed;
		this.health = health;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public String getAnimalID(){
		return animalID;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getBeenFed(){
		return beenFed;
	}
	
	public String getHealth(){
		return health;
	}
}
