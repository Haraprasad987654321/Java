package app01; 
import java.util.Scanner;



public class circleoperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values like insert the radius and then height of the circle  : ");
		final double pie = 22.0/7.0;
		double r = sc.nextDouble();
		//double h = sc.nextDouble();
		double ans = (2*pie*r);
		System.out.println("The perimeter of the circle is  : "+ans);
		double area = (pie*Math.pow(r, 2));
		System.out.println("The area of the circle is :"+area);
		double vol = 4.0/3.0*pie*(Math.pow(r, 3));
		System.out.println("The volume of the sphere is : "+vol);
		
////		double ans = 4.0/3.0; Max(int , 2nd datatype , 3rd datatype) 
//	System.out.println(ans);
//		
//		double x = 6.0;
//		System.out.println(x);
//		
		
		
		
		

	}

}

Q 3 area of a tringle /*

    import java.util.Scanner;
    public static void main (string[]args);
    System.out.println();

