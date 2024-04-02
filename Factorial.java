import java.util.Scanner;
class Factorial 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number to find factorial : ");
		int num=scan.nextInt();
		System.out.println("The factorial of "+num+" is "+factorial(num));
	}
	public static int factorial(int n){
		int fact=1 ;
		for(int i=n;i>1;i--){
			fact =fact*i;
		}
		return fact;
	}
}
