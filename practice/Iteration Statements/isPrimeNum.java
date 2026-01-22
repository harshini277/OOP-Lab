/*for loop*/
import java.util.*;
public class isPrimeNum{
	public static void main(String args[]){
		int n;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = num.nextInt();
		Boolean isPrime = true;
		for(int i=2;i<n;i++){
			if (n%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(n+" is a prime number.");
		}else{
			System.out.println(n+" is not a prime number.");
		}
	}

}
