
package bignumber;
import java.util.Scanner;


public class bignumberifelse {

	public static void main(String[] args) /** { 
		System.out.println("Enter the numbers which you want to compair or find the big number");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		int big = (int) ((x>y) ? x: y);
		System.out.println(big);
		
		
		
		}
	} */
	{
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

	
