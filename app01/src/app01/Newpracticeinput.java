package app01;
import java.util.Scanner;
public class Newpracticeinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		 String name = sc.nextLine();
//		 System.out.println("Your Name is : " + name);
//		 
//		 System.out.println(" Enter your Age ");
//		 int age = sc.nextInt();
//		 System.out.println("Your age is : "+ age);
		
		String name;
		int age;
		float height;
		System.out.println("Enter Name, age, Height: ");
		name = sc.nextLine();
		age=sc.nextInt();
		height = sc.nextFloat();
		System.out.println("Name is: "+name+"\nAge is: "+age+"\Height is: "+ height);
		
		 
		 
		 

	}

}
