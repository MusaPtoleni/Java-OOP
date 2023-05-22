package pets;

public class Pets {

	public static void main(String[] args){
		
		//Dogs
	    Dog jack = new Dog("Jack", 4, 2018,"Female","Black and Wite");
		Dog roofy = new Dog("Roofy", 10, 2012,"Female","White");
		Dog bruno = new Dog("Bruno", 6, 2016,"Male","Black");
		
		//Cats
		Cat mika = new Cat("Mika", 6, 2016, "Female", "Orange");
		Cat tuna = new Cat("Tuna", 3, 2019, "Female", "Grey and White");
		Cat putin = new Cat("Putin", 1, 2021, "Male", "Grey");
		
		//Printing Dog objects
		System.out.println("Dogs\n");
		System.out.println(jack + "\n");
		System.out.println(roofy + "\n");
		System.out.println(bruno + "\n");
		
		//Printing Cat objects
		System.out.println("Cats\n");
		System.out.println(mika + "\n");
		System.out.println(tuna + "\n");
		System.out.println(putin);

	}
}

// Used the examples to see how the task should be done..
