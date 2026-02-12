class Father{
	final float landArea = 57.5f;
	final String propertyType = "Land";
	void showProperty(){
		System.out.println("Total land area owned by the family: "+landArea);
		System.out.println("Type of property owned: "+propertyType);
	}
}
class ChildOne extends Father{
	String usage="House";
	void showUsage(){
		System.out.println("Usage by childOne: "+usage);
	}
}
class ChildTwo extends Father{
	String usage="Cultivation";
	void showUsage(){
		System.out.println("Usage by childTwo: "+usage);
	}
}

public class PropertyManagementSystem{
	public static void main(String[] args){
		ChildOne c1 = new ChildOne();
		ChildTwo c2 = new ChildTwo();
		
		System.out.println("Child One");
		System.out.println("Property: "+c1.landArea);
		System.out.println("Usage: "+c1.usage);

		System.out.println("Child Two");
		System.out.println("Property: "+c2.landArea);
		System.out.println("Usage: "+c2.usage);
	}
}