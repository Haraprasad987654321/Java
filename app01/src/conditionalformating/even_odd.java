package conditionalformating;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		System.out.println("Enter the desired number which you want to check if its even or odd");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x/2 == (x-1)/2){
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	
		
		
	}

}
