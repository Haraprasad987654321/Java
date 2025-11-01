package app01;
import java.util.Scanner;

public class printdigitwithoutlastdugit {

	public static void main(String[] args) {
	System.out.println("E");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("Its a palindrome number")	;
	}
	else {
		System.out.println("Not a palindrome numver");
	}
//	System.out.println(rev);
	
	}

}
