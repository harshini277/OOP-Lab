abstract class Animal{
	static String msg="Any animal";
	final int animalCount = 0;
	abstract void animalSpecies();
}
class Dog extends Animal{
	void animalSpecies(){
	System.out.println("Dog");
	}
}
public class Nonaccess {
	public static void main(String[] args){
		System.out.println(Animal.msg);
		Dog d = new Dog();
		d.animalSpecies();	
		System.out.println("Total Animals: "+ d.animalCount);
	}
}