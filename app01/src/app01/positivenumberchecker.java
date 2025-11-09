package app01;
import java.util.Scanner;
public class positivenumberchecker {

	public static void main(String[] args) {
		System.out.println("Enter the number which you want to check");
		Scanner sc = new Scanner (System.in);
		double x =sc.nextDouble();
		if (x>0) {
			System.out.println("The number is a Postive Number (Intiger) ");
		}else if (x<0){
			System.out.println("The number which you have entered is negative number");
		}

	}

}
