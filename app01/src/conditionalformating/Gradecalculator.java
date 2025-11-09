package conditionalformating;
import java.util.Scanner;

public class Gradecalculator {

	public static void main(String[] args) {
		System.out.println("Enter the score obtained by you ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		if (x<0 || x>100) {
			System.out.println("You have entered a invalide  score , Please enter a valid score within 0 to 100 ");
		}else if (x>90) {
			System.out.println("your grade is  O ");
		}
		else if(x>85) {
			System.out.println("Your grade is A+");
		}else if(x>80) {
			System.out.println("Your grade is A ");
		}else if (x>75) {
			System.out.println("Your grade is B+");
		}else if(x>70) {
			System.out.println("Your Grade is B");
		}else if(x>65) {
			System.out.println("Your Grade is c+");
		}else if (x>60) {
			System.out.println("Your hrade is C");
			
		}else if (x>50) {
			System.out.println("Your grade is D");
		}else if (x >= 40) {
			System.out.println("You have passed the exam with marginal score");
		}else if (x<40) {
			System.out.println("You have Failed the exam ,Try to give more time to the subject you will definitely perform very Good ");
		}
		
		

	}

}
