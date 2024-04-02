import java.util.Scanner;
class SpyNumber 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check spy number :");
		int num=scan.nextInt();
		if (spy(num))
		{
			System.out.println(num+" is Spy Number.");
		}
		else System.out.println(num + " is not a Spy Number.");
		

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
	public static int product(int n){
		int pro=1,rem;
		while(n!=0){
			rem=n%10;
			pro=pro*rem;
			n/=10;
		}
		return pro;
	}
	public static boolean spy(int n1){
		return (sum(n1)==product(n1));
	}
}
