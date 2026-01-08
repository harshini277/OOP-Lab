import java.util.*;
public class fibonacci {
	public static void main(String args[]) {
		int n;
		int a=-1;
		int b=1;
		int c = a+b;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		n = num.nextInt();
		while(n>0){
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a+b;
			n--;
		}
	}
}
