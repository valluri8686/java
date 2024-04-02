import java.util.Scanner;
class PrimeNum 
{
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check prime :");
		int num=scan.nextInt();
		if (prime(num))
		{
			System.out.println(num +" is a Prime number.");
		}
		else{
			System.out.println(num +" is not a Prime number.");
		}
		

	}
	public static boolean prime(int n){
		int count=0;
		if (n==1)
		{
			return true;
		}
		for(int i=1;i<=n;i++){
			 if (n%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
}
