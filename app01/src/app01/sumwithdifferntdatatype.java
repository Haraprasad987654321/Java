package app01;
import java.util.Scanner;
public class sumwithdifferntdatatype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the values which you want to divide ");

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Enter the operator ");
		char operator=sc.next().charAt(0);
		

		
		
		switch(operator){
		case '+':
			double sum = num1+num2;
			System.out.println("The output is :"+sum);
			break;
		case '-':
			double sub = num1-num2;

			System.out.println("The output is :"+sub);
			break;
		case '*':
			double muli =num1*num2;

			System.out.println("The output is :"+muli);
			break;
		case '/':
			double divide = num1/num2;
			System.out.println("The output is :"+divide);
			break;
		case '%':
			double rem = num1%num2;
			
			System.out.println("The output is :"+rem);
			break;
		default:
		System.out.println("Invalid operator");
		}
		
	
		
		sc.close();

		

	}

}
