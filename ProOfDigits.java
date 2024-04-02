import java.util.Scanner;
class ProOfDigits 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for product of digits :");
		int num=scan.nextInt();
		System.out.println(product(num));

	}
	public static int product(int n){
		int pro=1,rem;
		while(n!=0){
			rem=n%10;
			pro=pro*rem;
			n/=10;
		}
		return pro;
	}
}