package app01;
import java.util.Scanner;



public class UserInput1 {

	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double cir = 2*Math.PI* x ;
		System.out.println(" Circurferance of the circle is  "+ x );
		double area = Math.PI*Math.pow(2, x);
		System.out.println("Area of the circle is "+ area);
	
		
		
		
	
		
		
		

	}

}
