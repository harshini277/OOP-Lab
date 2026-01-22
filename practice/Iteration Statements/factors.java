/*for*/
import java.util.*;
public class factors{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = num.nextInt();
		System.out.print("Factors: ");
		for(int i=1;i<n+1;i++){
			if(n%i ==0){
				System.out.print(i+" ");
			}
		}
	}

}
