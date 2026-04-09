package firstPackage;

public class Demo {
	int a,b;

	Demo(int a, int b){
		this.a = a;
		this.b = b;
	}

	public void getmax(){
		if(a>b){
			System.out.println("Max is: "+a);
		} else {
			System.out.println("Max is: "+b);
		}
	}
}