package app01;

import java.util.Scanner;

public class EquationEval {
	public static void main (String [] args)
	
	
	{
		System.out.println("Enter your age we will check if you are eligible to vote or not ");
		Scanner sc = new Scanner (System.in);
		double x = sc.nextDouble();
		String y = (x>=18)? ((x<100)? "Yes you are Eligibel" : "No you are over aged" ): "No you are under aged" ;
		System.out.println(y);
	
	}
}


