package app01;
import java.util.Scanner; 
public class bignumbetweentwonum {

	public static void main(String[] args) {
		System.out.println("Enter the numbers which you want to compair :");
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double y = sc.nextDouble();
		double com = ( w + y - Math.abs(w-y) )/2;
		System.out.println("Smallestest number is : "+ com);
		System.out.println("hello");
		
	}

}
