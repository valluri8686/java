import java.util.Scanner;
class PerfectNum 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number to check perfect number : ");
		int num =scan.nextInt();
		if(perfectNum(num)){
			System.out.println(num +" is perfect number.");
		}
		else{
			System.out.println(num +" is not a perfect number.");
		}
	}
	public static boolean perfectNum(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		return n==sum;
	}
}
