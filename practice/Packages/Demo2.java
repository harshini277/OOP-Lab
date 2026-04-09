package secondPackage;

import firstPackage.Demo;

public class Demo2{
	public static void main(String[] args){
		int a = 8,b=9;
		int c = 7,d=7;
		int e = 9,f=5;
		Demo d1 = new Demo(a,b);
		Demo d2 = new Demo(c,d);
		Demo d3 = new Demo(e,f);
		if (a!=b){
			d1.getmax();
		} else {
			System.out.println("Both are equal");
		}

		if (c!=d){
			d2.getmax();
		} else {
			System.out.println("Both are equal");
		}

		if (e!=f){
			d3.getmax();
		} else {
			System.out.println("Both are equal");
		}
	}
}