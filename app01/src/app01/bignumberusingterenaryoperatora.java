package app01;
import java.util.*;
public class bignumberusingterenaryoperatora {

	public static void main(String[] args) {System.out.println("Enther the number you want to print");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = (a>b)?((a>c)? a:c):((b>c)? b:c);
		System.out.println(s);

	}

}
