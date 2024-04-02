import java.util.Scanner;
class StrongNum 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number to check strong number : ");
		int num=scan.nextInt();
		if (strong(num))
		{
			System.out.println(num+" is a strong number");
		}
		else{
			System.out.println(num+ " is not a strong number");
		}
	}
	public static int factorial(int n){
		int fact=1 ;
		for(int i=n;i>1;i--){
			fact =fact*i;
		}
		return fact;
	}
	public static boolean strong(int n){
		int sum=0,rem,temp=n;
		while(n!=0){
			rem=n%10;
			sum=sum+factorial(rem);
			n/=10;
		}
		return temp==sum;
	}
	
}
