package app01;
import java.util.Scanner;

public class speedandvelocity {

	public static void main(String[] args) {
		System.out.println("Enter the velocity and time ");
		Scanner sc = new Scanner(System.in);
		int velocity1 = sc.nextInt();
		int time2 = sc.nextInt();
		int velocity = velocity1*time2;
		System.out.println("THe speed is "+ velocity);
		
	}

}
