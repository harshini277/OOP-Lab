public class B extends A{
	public static void main(String[] args){
		//System.out.println(publicText);     	//wont come bc static 
        	//System.out.println(privateText);   	// no access
        	//System.out.println(defaultText); 	//won't come
        	//System.out.println(protectedText); 	//wont come bc static 

		B b = new B();
		System.out.println(b.publicText);     	//comes
        	//System.out.println(b.privateText);   	// no access
        	System.out.println(b.defaultText); 	//comes
        	System.out.println(b.protectedText); 	//comes bc instance
		
	}
}