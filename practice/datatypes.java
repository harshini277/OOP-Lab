public class datatypes{
	public static void main(String args[]){
		long yearOfBirth= 1980L;
		short dayOfBirth = 22;
		byte monthOfBirth = 8;
		int age = 45;
		char gender = 'M';

		float height = 1.75f;
		double weight = 68.5d;
		boolean normalWeight;
		double bmi;
		bmi = weight/(height*height);

		System.out.println("Date of birth: "+dayOfBirth+"/"+monthOfBirth+"/"+yearOfBirth);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("BMI: "+bmi);
		if(bmi<25 && bmi>18){
			normalWeight = true;
		}else{
			normalWeight = false;
		}
		System.out.println("Normal Weight: "+normalWeight);
	}
}

