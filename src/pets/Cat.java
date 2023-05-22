package pets;

public class Cat {
	//Cat Attributes
	String name;
	int age;
	int born;
	String gender;
	String color;
	
	//Method
	public Cat(String name, int age, int born, String gender, String color) {
		this.name = name;
		this.age = age;
		this.born = born;
		this.gender = gender;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return  age; 
	}
	
	public int getYear() {
		return  born; 
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		output += "\nBorn: " + born;
		output += "\nGender: " + gender;
		output += "\nColor: " + color;
		return output;		
	}
	
}
