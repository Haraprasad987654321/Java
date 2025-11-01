package app01;
import java.util.*;
public class againstart {

	public static void main(String[] args) {
		System.out.println("Give the redius of the circile");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        double y = Math.PI;
		double z = y*Math.pow(x, 2);
		
		System.out.println("The area of the Circle "+ z);
		double r = 2*Math.PI*x ;
		System.out.println("The circurferance of the circle " + r);

	}

}
