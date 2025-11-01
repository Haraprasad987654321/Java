package app01;
import java.util.*;

public class prateek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double s= (a+b+c)/2;
		double ans =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The answer is"+ans);

	}

}
