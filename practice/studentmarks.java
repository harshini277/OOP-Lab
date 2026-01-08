import java.util.*;
public class studentMarks {
	public static void main(String args[]){
		int math,phy,chem,cs,eng;
		double score;
		boolean result = true;
		Scanner marks = new Scanner(System.in);
		while(result){
			System.out.println("Enter Maths marks: ");
			math = marks.nextInt();
			System.out.println("Enter Physics marks: ");
			phy = marks.nextInt();
			System.out.println("Enter Chemistry marks: ");
			chem = marks.nextInt();
			System.out.println("Enter CS marks: ");
			cs = marks.nextInt();
			System.out.println("Enter English marks: ");
			eng = marks.nextInt();
		score = (math+phy+chem+cs+eng)/5;
		if (score>90)
			System.out.println("Grade A");
		else if (score>80)
			System.out.println("Grade B");
		else if (score>70)
			System.out.println("Grade C");
		else if (score>60)
			System.out.println("Grade D");
		else
			System.out.println("Grade F");

		System.out.println("Are there any more students? (true/false) ");
		result = marks.nextBoolean();
		}
	}
}

			
