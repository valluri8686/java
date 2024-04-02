import java.util.Scanner;
class SumOfDigits 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for summation of digits :");
		int num=scan.nextInt();
		System.out.println(sum(num));

	}
	public static int sum(int n){
		int sum=0,rem;
		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		return sum;
	}
}
