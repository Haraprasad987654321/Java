package app01;
import java.util.Scanner;
public class newjava {
//
	public static void main(String[] args) {
		System.out.println("Enter the value of the side of the tringle : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = (a+b+c)/2;
		System.out.println("The area of the tringle is : ");
		System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		
	}

}
