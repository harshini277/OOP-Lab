/*Switch case*/
import java.util.*;

public class Calculator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1, num2;
		String op;
		System.out.print("Enter Number 1: ");
		num1 = in.nextInt();
		System.out.print("Enter Number 2: ");
		num2 = in.nextInt();
		System.out.print("Enter Operator (+-/*%): ");
		op = in.next();
		
		switch (op){
			case "+":
			System.out.println(num1+num2);
			break;
			case "-":
			System.out.println(num1-num2);
			break;
			case "*":
			System.out.println(num1*num2);
			break;
			case "/":
			System.out.println(num1/num2);
			break;
			case "%":
			System.out.println(num1%num2);
			break;
		}
	}
}