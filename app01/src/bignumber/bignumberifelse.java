/**Big number from user input */
package bignumber;
import java.util.Scanner;


public class bignumberifelse {

	public static void main(String[] args) {
		System.out.println("Enter the two number which you want to compair ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double big ;
		if (x>y)  {
			big =  x;
		}
		else {
			big = y;
		}
		System.out.println("Greater is "+big);
		
      
	}

}
