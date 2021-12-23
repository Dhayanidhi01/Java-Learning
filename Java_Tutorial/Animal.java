package Java_Tutorial;

public class Animal {

	String animal_name;
	String animal_type;
	
	
	Animal(String name, String type){
		animal_name=name;
		animal_type=type;	
	}
	
	public void sayAboutAnimal() {
		
		System.out.println("Animal name is " + animal_name +" and type is " +animal_type);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1=new Animal("Pura", "Omnivores");
 		animal1.sayAboutAnimal();
		Animal animal2=new Animal("Puli", "Omnivores");
		animal2.sayAboutAnimal();
		
	}

}
