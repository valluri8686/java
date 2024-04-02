import java.util.Scanner;
class ReverseNum {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number to reverse ");
		int num=scan.nextInt();
		System.out.println("Reverse of the given number is "+reverse(num));

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
}
