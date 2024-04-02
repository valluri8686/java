 
import java.util.Scanner;
class NumPalindromeOrNot {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number to check palindrome or not ");
		int num=scan.nextInt();
		if(palindrome(num)){

		System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}

	}
	public static int reverse(int i){
		int rev=0,rem;

		while(i!=0){
			rem=i%10;
			rev=rev*10+rem;
			i/=10;
		}
		return rev;
	}
	public static boolean palindrome(int n){
		return n==reverse(n);
	}
}
