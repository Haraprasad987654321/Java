package app01;
import java.util.Scanner;
public class sumoftwonumberwithoutplusoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double ans = Math.max(x, y);
		System.out.println("The gretest num is : "+ans);
	}

}
