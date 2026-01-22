/*do while*/
import java.util.*;
public class sumOfDigits {
	public static void main(String args[]){
		int rem,num,sum;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number");
		num = number.nextInt();
		sum = 0;
		do {
			rem = num%10;
			num = num/10;
			sum = sum+rem;
		}while(num>0);
		System.out.println("Sum of digits: "+sum);
	}
}

