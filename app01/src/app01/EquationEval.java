package app01;

import java.util.Scanner;


public class EquationEval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		double a =sc.nextDouble();
		double b=sc.nextDouble();
		double x=sc.nextDouble();
		double ans = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) + 2*a*b*Math.cos(x));
		System.out.println(ans);
		
//		
//		Q2:- User input n and a you have to find a^n;
		System.out.println("Enter Base");
		int a=sc.nextInt();
		System.out.println("Enter Power ");
		int n = sc.nextInt();
		double ans =Math.pow(a,n);
		System.out.println(a+"^"+n+"is: "+ans);
		
		*/
		
	//Q3 -
		System.out.println("Enter the values : ");
		final double pie = 3.14;
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		double ans = (pie*Math.pow(r, 2));
		System.out.println(ans);
		
		
		
		
		
	}

}
